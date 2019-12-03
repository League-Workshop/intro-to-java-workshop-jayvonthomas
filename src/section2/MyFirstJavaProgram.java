package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot Lizzy = new Robot();
		Lizzy.setSpeed(100);
		Lizzy.penDown();
		
		for (int i = 0; i < 360; i++) {
			Lizzy.move(1);
			Lizzy.turn(1);
		}
		
//		Lizzy.move(100);
//		Lizzy.turn(90);
//		Lizzy.move(100);
//		Lizzy.turn(90);
//		Lizzy.move(100);

	}
}
