package Exceptionhandlings;

public class ThrowExample {
    public static int validate (int age) throws ArithmeticException{
        if (age<18){
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote");
        }
        return age;
    }

    public static void main(String[] args) {
        try {
            int t = validate(15);
            System.out.println("t");
        }catch (Exception e){
            System.out.println("Person is not eligible to vote");
        }
    }
}
