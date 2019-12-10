package section3;

import org.jointheleague.graphical.robot.Robot;

public class Tiger {

	public static void main(String[] args) {
		Robot tiger = new Robot();
		tiger.changeRobot("https://previews.123rf.com/images/irwanjos/irwanjos1407/irwanjos140700004/30015171-cute-female-tiger-cartoon.jpg");
		tiger.penDown();
	    tiger.setRandomPenColor();
	    tiger.setPenWidth(300);
		tiger.move(200);
		tiger.turn(150);
		tiger.move(100);
		tiger.move(100);
		tiger.move(100);
		tiger.turn(100);
		tiger.move(150);
		tiger.turn(100);
		tiger.move(105);
		tiger.turn(100);
		tiger.move(50);
	}
}
