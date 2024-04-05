package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratot {
    public static void main(String[] args) {
        ArrayList<String> gain = new ArrayList<String>();
        gain.add("Nitish");
        gain.add("Gaffur");
        gain.add("Ankit");
        gain.add("Owais");


        System.out.println("Traversing list through List Iterator:");
        Collections.reverse(gain);
//        ListIterator<String> gain1 = gain.listIterator(gain.size());
//        while(gain1.hasPrevious()){
//            String str= gain1.previous();
//            System.out.println(str);
//        }
        System.out.println(gain);
    }
}
