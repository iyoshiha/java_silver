package exception_practice;

public class _4 {

	public static void main(String[] args) {
		try {
			Object obj = null;
				System.out.println(obj.toString());

				System.out.println("A");
		} catch (NullPointerException e) {
			System.out.println("B");
		} finally {
			System.out.println("C");
		}
	}
}
