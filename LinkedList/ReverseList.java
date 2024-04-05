package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseList {
    public static void main(String[] args) {
//        LinkedList<String> l2 = new LinkedList<String>();
//        l2.add("Nitish");
//        l2.add("Gaffur");
//        l2.add("Mayur");
//
//        Iterator i = l2.descendingIterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        Collections.addAll(l3,1,2,3,4,5);
        Iterator j = l3.descendingIterator();
        while (j.hasNext()){
            System.out.println(j.next());
        }
        //System.out.println(l3);
    }
}
