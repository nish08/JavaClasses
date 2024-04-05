package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Sample1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Book1");
        list.add("Book2");
        list.add("Book3");
        list.add("Book4");
        list.add(4,"Book5"); //add the new element
        list.set(1,"Mango"); //set the element of 1 Book2 to Mango

        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("Harry Potter");
        list1.add("Happy Spiritual");

        list.addAll(list1);
        //list.addAll(0,list1); // it ll bring list 1 to 0th index;

//        Iterator<String> itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
        for (String s:list){
            System.out.println(s);
        }
    }
}
