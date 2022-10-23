package com.hoServer.hoyoung.study2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(method = RequestMethod.GET, value = "test")
public class HelloController {

    @GetMapping()
    public String Hi() {
        return "Hi World";
    }

    @GetMapping("/hello")
    public String Hello() {
        return "Hello World";
    }

    @GetMapping("name2/{name}")
    public String GetName(@PathVariable(value="name") final String name){
        return name;
    }

    // http://localhost:8080/test/sopt?part=%EC%84%9C%EB%B2%84&type=YB
    @GetMapping("/sopt")
    public String getPart(
            @RequestParam(value="part", defaultValue ="") final String part,
            @RequestParam(value="type", defaultValue="") final String type
    ){
        return "파트는 " + part + "이고, " + type + "입니다.";
    }

    @PostMapping("member")
    public String postMember(@RequestBody final Member member){
        return member.getName();
    }

    @PutMapping("member")
    public String putMember(@RequestBody final Member member){
        return member.getName();
    }

    @DeleteMapping("member")
    public String deleteMember(@RequestBody final Member member){
        return member.getName();
    }

}

