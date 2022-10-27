package com.hoServer.hoyoung.assignment2;

import com.hoServer.hoyoung.study2.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;


// 테스트용: INSERT INTO POST VALUES(1, 'Hello' ,'test');

@RestController
@RequestMapping(value = "posts")
@RequiredArgsConstructor
public class PostRequestController {

    private final EntityManager em;

    // GET /BASE_URL/posts
    @GetMapping()
    @Transactional
    public List<Post> readPostList(){
        return em.createQuery("SELECT p FROM Post p",Post.class).getResultList();
    }

    // POST /BASE_URL/posts
    @PostMapping()
    @Transactional
    public Post createPost(@RequestBody final Post post){
        em.persist(post);
        return post;
    }

    // GET /BASE_URL/posts/{postId}
    @GetMapping("{postId}")
    @Transactional
    public Post readOnePost(@PathVariable(value="postId") final Long postId){
        return em.find(Post.class, postId);
    }

    // PUT /BASE_URL/posts/{postID}
    @PutMapping("{postId}")
    @Transactional
    public String PutOnePost(@PathVariable(value="postId") final Long postId){
        return "id: "+postId+"인 Post 정보 통으로 교체";
    }

    // PATCH /BASE_URL/posts/{postID}
    @PatchMapping("{postId}")
    @Transactional
    public String PatchOnePost(@PathVariable(value="postId") final Long postId){
        return "id: "+postId+"인 Post 정보 통으로 일부 변경";
    }

    // DELETE /BASE_URL/posts/{postID}
    @DeleteMapping("{postId}")
    @Transactional
    public void DeleteOnePost(@PathVariable(value="postId") final Long postId){
        Post post = em.find(Post.class, postId);
        em.remove(post);
    }

}
