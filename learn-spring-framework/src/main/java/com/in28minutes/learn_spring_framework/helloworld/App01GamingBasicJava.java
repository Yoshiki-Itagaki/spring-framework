package com.in28minutes.learn_spring_framework.helloworld;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame(); //1: Object Creation
		var gameRunner = new GameRunner(game); //2: Object Creation + Wiring of Dependencies
		// Game is a Dependency of GameRunner
		gameRunner.run();

	}

}
