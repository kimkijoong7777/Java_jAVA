package chap09.sec01.exam02;

public class A {
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	static C field4 = new C();
	
	static void method2() {
		C var2 = new C();
	}
	
	// 인스턴 멤버 클래스
	class B {}
	// 정적 멤버 클래스
	static class C {}
}
