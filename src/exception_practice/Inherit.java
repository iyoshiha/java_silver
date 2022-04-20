package exception_practice;

public class Inherit {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		B c = new B();
		System.out.println(a instanceof B);
		System.out.println(b instanceof A);
		System.out.println(c instanceof A);
//		ArrayList<String> list = new ArrayList<>();
//		list.add("A");
//		list.add(1,"b");
//		list.add(0, "c");
//		list.add(1, "d");
//		list.remove("A");
//		for (String str : list) {
			System.out.println();
			
//		}
	}
}

class A {
	
}

class B extends A {
	
}

class C {
	
}