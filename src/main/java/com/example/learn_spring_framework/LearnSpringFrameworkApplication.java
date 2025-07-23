package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.PacManGame;
import com.example.learn_spring_framework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame game1 = new MarioGame();
		PacManGame game2 = new PacManGame();
		SuperContraGame game3 = new SuperContraGame();
		GameRunner runner = new GameRunner(game3);
		runner.run();
	}

}
