package chap07.sec03.exam01;

import chap07.sec03.exam01.SmartPhone;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}