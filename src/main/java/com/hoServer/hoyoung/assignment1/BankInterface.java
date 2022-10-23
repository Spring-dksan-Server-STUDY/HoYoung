package com.hoServer.hoyoung.assignment1;

public interface BankInterface {

    // 상수 필드
    public int MAX_LIMIT = 1000000;

    // 추상메소드
    void withDraw(int money);

    void deposit(int money);

    // 디폴트 메소드
    default String[] listAvailableBank(int userId){
        System.out.println("이용가능한 Bank 목록 조회");
        if (userId < 1000){
            return new String[]{"카카오뱅크", "국민은행"};
        }
        else{
            return new String[]{"신한은행"};
        }
    }

    // 정적 메소드
    static String welcomeMessage(){
        return "welcome to bank!";
    }


}
