package com.hoServer.hoyoung.study1;

public class Part {

    private String name;

    public void test(){
        System.out.println("부모 클래스입니다.");
    }

    public Part(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
