package exception_practice;

public class RetrurnInt {

	public static void main(String[] args) {

		System.out.print(RetrurnInt.test());

		
	}
	static int test() {
		int val = 0;
		try {
//			System.out.println(RetrurnInt.nu());
		} catch (ArithmeticException e){
			
			val = 10;
			return val;

		}finally {
			val += 100;
			
		}
			System.out.println("end");
		return val;
	}
	
	static int nu() {
		throw new ArithmeticException();
	}
}
