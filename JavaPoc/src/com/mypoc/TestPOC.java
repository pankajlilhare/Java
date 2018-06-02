package com.mypoc;
class A{
	A() {
		System.out.println("--A-Constructor-");
	}
	
}
class  B extends A {
	B() {
		System.out.println("--B--");
	}
}
public class TestPOC {

	public static void main(String[] args) {
		B b = new B();
		

	}

}
