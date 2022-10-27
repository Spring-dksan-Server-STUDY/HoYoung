package com.hoServer.hoyoung.study1;

public class Server extends Part{
    private String study;

    @Override
    public void test() {
        super.test();
        System.out.println("자식 클래스 입니다.");
    }

    public Server(String name, String study) {
        super(name);
        this.study = study;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
