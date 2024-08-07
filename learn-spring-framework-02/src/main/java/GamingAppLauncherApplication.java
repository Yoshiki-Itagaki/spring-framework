
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

@Configuration
@ComponentScan("package com.in28minutes.learn_spring_framework.game")
public class GamingAppLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
			
			context.getBean(GamingConsole.class).up();	
			context.getBean(GameRunner.class).run();		
			
		}
	}
}
