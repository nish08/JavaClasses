package Collection.ArrayList;

import java.util.ArrayDeque;

public class ArrayDequeSample {
    public static void main(String[] args) {
//        ArrayDeque<Integer> ad1 = new ArrayDeque<Integer>();
//        ad1.add(1);
//        ad1.add(2);
//        ad1.add(3);
//
//        System.out.println(ad1);
        ArrayDeque<String> ad2 = new ArrayDeque<String>();
        ad2.add("Nitish");
        ad2.add("Dinu");
        ad2.offer("Sumit");
        ad2.add("Ankush");
        ad2.offerFirst("Yamini");
        ad2.offerLast("Maahi");

        System.out.println("Applying all methods");
        for (String s:ad2){
            System.out.println(s);
        }
        ad2.pollLast();
        System.out.println("After Poll Last");
        for (String s:ad2){
            System.out.println(s);
        }
    }
}
