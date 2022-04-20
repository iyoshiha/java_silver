package lambda;

public class Test {

	public static void main(String[] args) {
		
		final String la = "vi";

		Lam l = (name , i) -> {
			System.out.println(name + " " + i);
		};
		A a = new A(l);
		a.method();
	}
}

class A {
	Lam var;
	A(Lam l) {
		this.var = l;
	}
	public void method() {
		System.out.println("start");
		var.lambda("nice", 10);// ここで実行したい。
		System.out.println("end");
	}
}