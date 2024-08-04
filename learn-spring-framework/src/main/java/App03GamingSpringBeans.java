
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			
			context.getBean(GamingConsole.class).up();	
			context.getBean(GameRunner.class).run();		
			
		}
	}
}
