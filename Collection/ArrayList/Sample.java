package Collection.ArrayList;

import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(5);
        al.add(5);
        al.add(6);
        //for (int i=0; i<al.size();i++)
       // System.out.println(al);
        ArrayList <Integer> cl = new ArrayList<Integer>();
        cl.add(21);
        cl.add(22);
        cl.add(23);
        cl.add(24);
        cl.add(25);
        cl.add(26);
        cl.addAll(al);
        System.out.println(cl.contains(18));

//        ArrayList<String> fruits = new ArrayList<String>();
//        fruits.add("mango");
//        fruits.add("Apple");
//        fruits.add("banana");
//        fruits.add("Grapes");
//        fruits.add("kiwi");

//        for (int i=0;i<cl.size();i++){
//            System.out.println(cl.get(i));
//        }
//        System.out.println(cl);
    }
}
