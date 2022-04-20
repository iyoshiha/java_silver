package exception_practice;

public class ExP {
	public static void main(String[] args) {
		
		try {
			ExP.testA();
		} catch (ArrayIndexOutOfBoundsException e){
		System.out.println("in main catch");
		} catch (Exception e){
		System.out.println("in main2 catch");
		} finally {
			System.out.println("gensou");
		}
//		testA();
		System.out.println("testA");
//		Object obj = null;
//		System.out.println(obj.toString());
	}

	static int testA(){
		try {
		System.out.println(ExP.b());
		} catch (Exception e) {
			System.out.println("in testA in catch");
//				int a = 1/0;
		}

		System.out.println("out of testA catch");
		return 1;
	}

//	static void a() throws NullPointerException{
//		int[] a = {};
//		a[0] = 1;
//	}

	static int b() {
		boolean t = true;
//		try {
		if (true == t)
		throw new NullPointerException();
//		}catch (Exception e) {
//			return 3000;
//		}
		System.out.println("end b()");
		return 2;
	}
}