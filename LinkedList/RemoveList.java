package LinkedList;

import java.util.LinkedList;

public class RemoveList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Ravi");
        l1.add("Vijay");
        l1.add("Ajay");
        l1.add("Anuj");
        l1.add("Gaurav");
        l1.add("Harsh");
        l1.add("Virat");
        l1.add("Gaurav");
        l1.add("Harsh");
        l1.add("Amit");

        System.out.println(l1);

        l1.remove("Virat");
        System.out.println("Remove Virat"+l1);

        l1.remove(0);
        System.out.println("Remove 0th Index:"+l1);

       // l1.removeAll(l1);
        //System.out.println("Remove All");

        l1.addAll(l1);
        System.out.println(l1);

    }
}
