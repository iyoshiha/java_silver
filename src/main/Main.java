package main;

public class Main {

	public static void main(String[] args) {
		
		SuperC c = new SuperC();
//		System.out.println(c.methodInt());
	}
}
class Parent {
	
	protected int a;
	
	Parent() {
		
	}

	Parent(int n) {
		this.a = n;
	}
	
	Parent methodA() {
		return new Parent();
	}
	int methodInt() {
		return a = 0;
	}
}

class SuperC extends Parent{
	
	SuperC() {
		this("Great");
	}
	
	SuperC(int n) {
		
	}
	
	SuperC(String str) {
		this(10);
	}
	
	Parent methodA() {
		return new SuperC();
	}
	@Override
	int methodInt() {
		return 1;
	}
}

class SubC extends SuperC {
	
	Parent methodA() {
		return new SuperC();
	}
	
	int methodInt() {
		return 2;
	}
}