package com.hoServer.hoyoung.study1;

public class UserServiceImpl implements UserInterface{
    @Override
    public void introduce(String name, String mbti) {
        System.out.println("추상 메소드");
        System.out.println("이름: "+name+", mbti: "+mbti);
    }

    @Override
    public void getInfo(int generation, String part) {
        UserInterface.super.getInfo(generation, part);
    }
}
