package StringBuilderPrac;

public class SBprac {

	    public static void main(String[] args) {
	    	String str = "01234567890";
	    	String star = "*****";
	    
	    	String[] ary = new String[9];

	    	System.out.println(ary.length);
	    	for (String s : ary) {
	    	System.out.println(s);
	    	}
	    	
	    	


	    	StringBuilder sb = new StringBuilder(str);
	    	CharSequence p = sb.subSequence(8, 10);

	    	StringBuilder sba = new StringBuilder(star);
	    	sba.append(str, 8, 10);

	    	StringBuilder sbb = new StringBuilder(str);
	    	StringBuilder s = sbb.insert(0, star);

	    	System.out.println(s == sba);
	   }
}