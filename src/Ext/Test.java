package Ext;

public class Test {
	static int i = 10;

	public static void test(Integer i){
		System.out.println("Integer");
	}
	public static void test(int i){
		System.out.println("int");
	}
	public static void main(String... args ){

//		short s = (short)Integer.MAX_VALUE;
	}

	public static void main(char c, String... args ) {
		Integer[] ary1 = {
				Integer.parseInt("10"),
				Integer.parseInt("20")
		};

		Integer[] ary2 = new Integer[2];

		System.arraycopy(ary1, 0, ary2, 0, ary1.length);
		ary1[0] = 100;
		System.out.println(ary2[0]);
		System.out.println(ary1[0]);
	}
	public static void main(int a, int b, String... args ) {

		try {
			new Test().thru();
		} catch(Exception e) {
		System.out.println("A");
		}
		 finally {
		System.out.println("B");
		}
		System.out.println("C");
	}
	void thru() throws Exception{
		try {
			throw new Exception();
		}catch(RuntimeException e) {
			System.out.println("null");
		}finally {
		System.out.println("D");
		}
		System.out.println("E");
	}

	public static void main(float t, String... args ){

		loop:
			for(int o=0;o<10;o++) {
				System.out.println("o = " +o);
				for(int i=0;i<10;i++)
				{
					if(o%2==0)
						continue loop;
					{
						System.out.print(i+" ");
						if (i == 9) 
							System.out.print('\n');
					}
				}
			}
	}

		
	public static void main(int i, String[] args) {

		
//		Label:for (int i = 0;i < 3 ; i++) {
//			System.out.println("outside loop " + i + " times");
//			for (int k = 0;k < 10;k++) {
//				System.out.println("inside loop " + k+ " times");
//				if (k == 3) {
//					System.out.println("k = "  + k + " break loop");
//					break Label;
//				}
//			}
//		}
//		
//		try {
//			System.out.println("first");
//			throw new RuntimeException();
//		} catch (RuntimeException e) {
//			System.out.println("second");
//		} catch (Exception e) {
//			System.out.println("fortch");	
//		}
//			System.out.println("fifth");	
	}
}
class Ace {
	int a = 10, b = 20;
	int num(int a, int b) {
		return this.a + this.b;
	}
}
interface Int {
	void print(String name);
}

class Ex {
	public int num;
	Ex (){};
	Ex (int n) {
		this.num = n;
	}
	void method1(double a, int b) {
		System.out.println("hello");
	}
	void method1(int a, double b) {
		System.out.println("hello");
	}
}

class Ex2 extends Ex{
	int n = 2;
}

class Ex3 extends Ex2{
	int n = 3;
	int k = 6;
	void method() {
		System.out.println("extended hello");
	}
	void method2() {
		System.out.println("original hello");
	}
}