package com.hoServer.hoyoung.assignment2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "posts")
public class PostRequestController {


    // GET /BASE_URL/posts
    @GetMapping()
    public String readPostList(){
        return "post 목록 반환";
    }

    // POST /BASE_URL/posts
    @PostMapping()
    public String createPost(@RequestBody final Post post){
        return "post 생성";
    }

    // GET /BASE_URL/posts/{postId}
    @GetMapping("{postId}")
    public String readOnePost(@PathVariable(value="postId") final String postId){
        return "id: "+postId+"인 Post 정보 반환";
    }

    // PUT /BASE_URL/posts/{postID}
    @PutMapping("{postId}")
    public String PutOnePost(@PathVariable(value="postId") final String postId){
        return "id: "+postId+"인 Post 정보 통으로 교체";
    }

    // PATCH /BASE_URL/posts/{postID}
    @PatchMapping("{postId}")
    public String PatchOnePost(@PathVariable(value="postId") final String postId){
        return "id: "+postId+"인 Post 정보 통으로 일부 변경";
    }

    // DELETE /BASE_URL/posts/{postID}
    @DeleteMapping("{postId}")
    public String DeleteOnePost(@PathVariable(value="postId") final String postId){
        return "id: "+postId+"인 Post 정보 삭제";
    }

}
