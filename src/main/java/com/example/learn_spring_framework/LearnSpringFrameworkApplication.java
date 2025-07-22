package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame game = new MarioGame();
		SuperContraGame game1 = new SuperContraGame();
		GameRunner runner = new GameRunner(game1);
		runner.run();
	}

}
