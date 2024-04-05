package Exceptionhandlings;

public class TryCatch {
    public static void main(String[] args) {
        //by harry

//        int a = 5000;
//        int b = 0;
//        try{
//        int c = a/b;
//        System.out.println("The result is:"+c);
//        }
//        catch (Exception e){
//            System.out.println("Divisible by 0 is occurred some problem");
//            System.out.println(e);
//        }
       // System.out.println("End the Program");

        //by tpoint
//        try{
//            int a = 100/0;
//            System.out.println(a);
//        }
//        catch (ArithmeticException e) {
//            System.out.println("100 is not divisible by 0");
//            System.out.println(e);
//        }
//        System.out.println("End the program");

        //array exceptions
        try {
            int[] arr = {10, 20, 30, 40, 50};
            System.out.println(arr[5]);
        } catch (Exception e){
            System.out.println(e);
            System.out.println("Array value is limited");
        }
    }
}
