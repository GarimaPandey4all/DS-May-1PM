package com.brainmentors.java.oops;

class A {
	int x;
	
	A() {
		//this(30);
		System.out.println("A Default Cons Call");
	}
	A(int x)
	{
		this.x = x;
		System.out.println("A Param Cons Call");
	}
}

class B extends A {
	
	int x;
	
	B()
	{
		//this(10);
		System.out.println("B Default Cons Call");
	}
	B(int x)
	{
		super(500);
		this.x = x;
		System.out.println("B Param Cons call");
	}
}

public class SupervsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();
	}

}
