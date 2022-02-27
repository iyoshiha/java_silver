package main;

public class Main {

	public static void main(String[] args) {

		String monthStr="t";
		switch (monthStr) {
			case "nice": monthStr = "January";
					break;
					
			case "great":	monthStr = "February";
					break;
			case "sucks":	monthStr = "March";
						
					
			case "brutal women":	monthStr = "April";
			break;
			
			default: monthStr = "YOU WERE NOT BORN!!!";
				
		}
		System.out.println(monthStr);
	}

}
