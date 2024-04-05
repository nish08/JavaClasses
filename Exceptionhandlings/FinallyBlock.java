package Exceptionhandlings;

public class FinallyBlock {
    public static int greet(){
        try{
            int a = 25;
            int b = 5;
            int c =a/b;
            return c;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Program is Ended");
        }
        return 0;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int j = 8;
        int i = 9;
        while (true){
            try{
                System.out.println(j/i);
            }catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("The block is executed and the value of b is" +i);
            }
            i--;
        }
//         try{
//             int a = 25;
//             int b = 0;
//             int c = a/b;
//             System.out.println(c);
//         }catch (Exception e){
//
//             System.out.println(e);
//         }
//         finally {
//             System.out.println("The program is ended");
//         }
//        try{
//            System.out.println("Inside the try block");
//            int data = 25/0;
//            System.out.println(data);
//        } catch (ArithmeticException e) {
//            System.out.println("Exception handled");
//            //System.out.println(e);
//        }
//        finally {
//            System.out.println("finally block is always executed");
//        }
    }
}
