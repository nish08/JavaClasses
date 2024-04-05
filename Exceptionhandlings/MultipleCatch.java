package Exceptionhandlings;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        int [] marks = new int[4];
        marks[0] = 52;
        marks[1] = 25;
        marks[2] = 18;
        marks[3] = 35;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array index:");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with:");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is: "+marks[ind]);
            System.out.println("The value of array-value/number is:"+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception is occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException is occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
