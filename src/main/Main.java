package main;

public class Main {

	public static void main(String[] args) {
		
		Parent p = new SuperC();
//		p.M();

//		System.out.println(c.methodInt());
	}
}
class Parent {
	
	protected int a;
//	
//	Parent() {
//		System.out.println("this is Parent D-constructer");
//	}

	Parent(int n) {
		this.a = n;
		System.out.println("this is Parent int-constructer");
	}
	
	private void M() {
		System.out.println("private MMM");
	}
	
	Parent methodA() {
		M();
		return new Parent(1);
	}
	int methodInt() {
		return a = 0;
	}
}

class SuperC extends Parent{
	
	SuperC() {
		this(10);
		System.out.println("this is superc D-constructer");
	}
	
	SuperC(int n) {
		super(10);
		System.out.println("this is superc int-constructer");
	}
	
	void methodSuperC() {
		System.out.println("superC");
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