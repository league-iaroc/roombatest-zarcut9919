package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(800,1000);
		sleep(1000);
		driveDirect(0,0);
		driveDirect(935,1000);
		sleep(4000);
		driveDirect(0,0);
		driveDirect(-100,0);
		sleep(3000);
		driveDirect(0,0);
		driveDirect(1000,900);
		
		
	}

	public void loop() {
	
	}
}
