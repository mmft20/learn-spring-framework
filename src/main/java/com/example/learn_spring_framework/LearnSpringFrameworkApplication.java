package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.PacManGame;
import com.example.learn_spring_framework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		// Creating the Spring Context and assigning it to a variable "context".
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		// Using Context to create a Bean.
		// As GameRunner class HAS a Instance of GamingConsole autowired, even a class of GaminConsole will be initialized.
		// At this moment only SuperContraGame is declared as @component hence SuperContraGame instance will be created as a dependency for GameRunner.
		// runner.run behaviour will show behaviour of SuperContraGame and not any other game.
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		// Commented code that is now not required because of creating Spring Context.
		/*		MarioGame game1 = new MarioGame();
		PacManGame game2 = new PacManGame();
		SuperContraGame game3 = new SuperContraGame();
		GameRunner runner = new GameRunner(game3);*/
	}

}
