package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Banana");
        list.add("Grapes");
        list.add("Apple");

       // Iterator itr = list.iterator();
      //  while (itr.hasNext()){
      //      System.out.println(itr.next());
        System.out.println("returning the element" +list.get(1));
        list.set(1,"Dates");
        for(String s:list){
            System.out.println(s);
        }

        }
    }
