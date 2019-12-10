package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Wolf {
public static void main(String[] args) {
	Robot wolf = new Robot();
	wolf.changeRobot("https://i.pinimg.com/originals/79/db/01/79db019fdb9be6e3d7e503ae35993100.png");
	wolf.penDown();
	wolf.setPenColor(Color.red);
	wolf.setPenWidth(100);
	wolf.move(200);
	wolf.turn(100);
	wolf.move(200);
	wolf.turn(100);
	wolf.move(200);
	wolf.turn(97);
	wolf.move(100);
	
	
	
	
	
	
	
	
	
	
	
}
}
