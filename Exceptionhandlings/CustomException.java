package Exceptionhandlings;

import java.util.Scanner;

class ExceptionHand extends Exception{
    @Override
    public String toString() {

         return "I am to String";
    }

    @Override
    public String getMessage() {
        return "I am get Message";
    }
}
public class CustomException {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9) {
            try {
                throw new ExceptionHand();
               // throw new ArithmeticException("throw an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
              //  System.out.println(e); //it ll always show to String method by default
                e.printStackTrace();
            }
            System.out.println("I am finished");
        }


    }
}
