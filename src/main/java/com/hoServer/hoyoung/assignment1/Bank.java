package com.hoServer.hoyoung.assignment1;

public class Bank implements BankInterface {


    @Override
    public void withDraw(int money) {
        if (money < Bank.MAX_LIMIT){
            System.out.println(money + "원 withdraw 수행");
        }
        else{
            System.out.println("withdraw 가능 금액 초과! " + Bank.MAX_LIMIT + "미만으로 가능합니다.");
        }
    }

    @Override
    public void deposit(int money) {
        if (money < Bank.MAX_LIMIT){
            System.out.println(money + "원 deposit 수행");
        }
        else{
            System.out.println("withdraw 가능 금액 초과! " + Bank.MAX_LIMIT + "미만으로 가능합니다.");
        }    }
}
