package com.hoServer.hoyoung;

import com.hoServer.hoyoung.study1.Generic;
import com.hoServer.hoyoung.study1.Server;
import com.hoServer.hoyoung.study1.User;
import com.hoServer.hoyoung.study1.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HoyoungApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoyoungApplication.class, args);
		User user = new User(1,"천호영","서버");
		user.introduce();

		user.setName("양지영");
		user.setPart("안드");

		String name = user.getName();
		System.out.println(name);
		user.introduce();

		UserServiceImpl userService = new UserServiceImpl();
		String club = userService.CLUB;
		System.out.println(club);
		userService.introduce("천호영","ENFJ");

		Server server = new Server("천호영","스터디");
		String name2 = server.getName();
		String study = server.getStudy();
		System.out.println(name2);
		System.out.println(study);

		server.test();

		Generic<String> generic1 = new Generic<>("d");
		Generic<Integer> generic2 = new Generic<>(23);
		generic1.printData();
		generic2.printData();

	}

}
