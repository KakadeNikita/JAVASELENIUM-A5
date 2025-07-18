package org.handlig_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class UnderstandingRobotClass {
	public static void main(String[] args) throws AWTException {
		Robot robot=new Robot();
		//robot.keyPress(KeyEvent.VK_ALT);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_ALT);
		//robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		
	}

}
