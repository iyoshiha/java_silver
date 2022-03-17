package main;

public class Main {

	public static void main(String[] args) {
		
		SuperC c = new SuperC();
//		System.out.println(c.methodInt());
	}
}
class Parent {
	
	Parent methodA() {
		return new Parent();
	}
	int methodInt() {
		return 0;
	}
}

class SuperC extends Parent{
	
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