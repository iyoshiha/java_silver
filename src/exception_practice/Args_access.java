package exception_practice;

public class Args_access {

	public static void main(String[] args) {
		System.out.println("abc".length());
		try {
			if (args.length == 0) {
				System.out.println("A");
			}
		} catch (NullPointerException e) {
			System.out.print("B");
		} finally {
			System.out.println("C");
		}
	}
}
