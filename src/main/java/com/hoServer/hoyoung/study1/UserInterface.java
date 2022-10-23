package com.hoServer.hoyoung.study1;

public interface UserInterface {
    // 상수 필드
    String CLUB = "SOPT";

    // 추상 메소드
    void introduce(String name, String mbti);

    // 디폴트 메소드
    default void getInfo(int generation, String part){
        System.out.println("generation: "+generation+"기, part:"+part);
    }

    // 정적 메소드
    static void introduceSOPT() {
        System.out.println("Shout Out Passion Together");
    }
}
