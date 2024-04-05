package Exceptionhandlings;

class ExceptionIdea extends Exception{
    @Override
    public String toString() {
        return "super.toString()";
    }

    @Override
    public String getMessage() {
        return "super.getMessage()";
    }
}

public class ThrowThrows {

    public static double area (int r) throws ExceptionIdea {
        if(r<0){
            throw new ExceptionIdea();
        }
        double results = Math.PI*r*r;
        return results;
    }
    public static int divide (int a, int b) throws ArithmeticException {
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {

        try{
            double t = area(5);
            System.out.println(t);

            int c = divide(6,0);
            System.out.println(c);
        } catch (Exception e){
            System.out.println("Exception");
        }


    }
}
