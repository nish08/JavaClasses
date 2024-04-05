package Collection.ArrayList;

import java.util.ArrayList;

public class GetSet {
    public static void main(String[] args) {
        ArrayList<String> fr = new ArrayList<String>();
        fr.add("Apple");
        fr.add("Mango");
        fr.add("Banana");
        fr.add("Grapes");
        System.out.println("Renaming fruits "+fr.get(2));
        fr.set(2,"Dates");
        for (String f:fr){
            System.out.println(f);
        }

    }
}
