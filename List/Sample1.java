package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        String [] array = {"Array","Java","Php","Html"};
        System.out.println("Printing Array:" + Arrays.toString(array));
        List<String> list = new ArrayList<String>();
        for (String lang:array){
            list.add(lang);
        }
        System.out.println("Printing List:" +list);
//        list.add("Mango");
//        list.add("Banana");
//        list.add("Grapes");
//        list.add("Orange");

        //System.out.println(list);
    }
}
