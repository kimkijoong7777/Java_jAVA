package sec01.chap08.exam06;

import sec01.chap08.exam04.Audio;
import sec01.chap08.exam04.RemoteControl;
import sec01.chap08.exam04.Television;

public class MyClass {
	RemoteControl rc = new Television();
	
	MyClass() {
	}
	MyClass(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
