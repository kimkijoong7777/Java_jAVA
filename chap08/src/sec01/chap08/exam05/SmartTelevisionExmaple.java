package sec01.chap08.exam05;

public class SmartTelevisionExmaple {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		Searchable searchable = tv;
		searchable.search("interface");
	}

}
