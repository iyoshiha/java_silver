package exception_practice;

public class FeepsEx {

    public static void checkOver10(int number) throws Exception{

        if(number <= 10) {

            Exception e = new Exception("数値が10以下です");
            throw e;

        }

    }

}