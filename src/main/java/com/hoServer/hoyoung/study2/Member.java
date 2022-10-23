package com.hoServer.hoyoung.study2;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int age;

    public Member() {}

    public Member(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
