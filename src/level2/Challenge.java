package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(500,500);
		sleep(4000);
		driveDirect(0,0);
		driveDirect(-500,0);
		sleep(610);
		driveDirect(0,0);
		driveDirect(500,500);
		sleep(1000);
		driveDirect(0,0);
		driveDirect(500,490);
		sleep(1000);
		driveDirect(0,0);
		driveDirect(0,-500);
		sleep(200);
		driveDirect(0,0);
		
	}

	public void loop() {
	
	}
}
