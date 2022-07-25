package com.kalix.leaderboard.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class LeaderboardDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaderboardDemoApplication.class, args);
	}
}
