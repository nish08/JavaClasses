package Programs;

import java.util.Scanner;

public class OddEven {
//    public static void main (String[] args){
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = reader.nextInt();
//
//        if(num%2==0){
//            System.out.println(num + " is even ");
//        }else{
//            System.out.println(num+ " is odd ");
//        }
//
//    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= scan.nextInt();
        findOddEven(num);
    }
    public static void findOddEven(int num){
        if(num%2==0){
            System.out.println("Number is Even:");
        }else {
            System.out.println("Number is Odd:");
        }


    }
}
