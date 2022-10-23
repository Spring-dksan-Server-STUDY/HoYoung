package com.hoServer.hoyoung.assignment1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(30);
        bank.withDraw(100000000);
        int userId = 300000;
        String[] availableBanks = bank.listAvailableBank(userId);
        System.out.println(Arrays.toString(availableBanks));


    }
}
