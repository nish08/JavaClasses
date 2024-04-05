package Exceptionhandlings;

public class PracticeSet_1 {
    public static void main(String[] args) {
        try{
            int a =5;
            int b= 0;
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Haha");
        }
        catch (IllegalAccessError ex){
            System.out.println(ex);
        }
    }
}
