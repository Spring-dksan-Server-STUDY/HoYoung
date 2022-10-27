package com.hoServer.hoyoung.assignment2;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(nullable = true)
    private String decription;

    public Post() {}

    public Post(Long id, String name, String decription) {
        this.id = id;
        this.name = name;
        this.decription = decription;
    }
}
