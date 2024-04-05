package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortOut {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Nitish");
        list1.add("Gaffur");
        list1.add("Mayur");
        list1.add("Owais");
        list1.add("Ankit");

        Collections.sort(list1);
        for (String l:list1){
            System.out.println(l);
        }
        System.out.println("Sorting");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);

        Collections.sort(list2);
        for (int j:list2){
            System.out.println(j);
        }


    }
}
