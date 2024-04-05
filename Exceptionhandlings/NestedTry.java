package Exceptionhandlings;

import java.util.Scanner;

public class NestedTry {
    public static void main(String[] args) {
        int [] month = new int[6];
        month[0] = 01;
        month[1] = 02;
        month[2] = 03;
        month[3] = 04;
        month[4] = 05;
        month[5] = 06;

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the Month");

            int ind = scanner.nextInt();
            try {
                System.out.println("Month is:");
               // int a = 12/ind;

                try {
                    System.out.println(month[ind]);
                    flag=false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Month is not exists");
                    System.out.println("Exception at Level 2");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Program is Running Successfully");
    }
}
