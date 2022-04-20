package exten;

public class Main {
	static public void main (String... args) {

		
	}
}

interface A {
	int a = 10;
	void test();
}
interface B extends A {
	void prac();
}
class C  implements B{
	public void test() {
		System.out.println("great");
	}
	public void prac () {
		System.out.println("great");
	}

	class Inner{
		Inner() {
			 System.out.println("nice");
		}
	}
}
class D {
	void test() {
		System.out.println("great");
	}
}
