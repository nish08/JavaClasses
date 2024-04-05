package Programs;

import java.util.HashSet;
import java.util.Set;

public class CheckTest {
    public static void main(String[] args) {
        int i =0;
        int j = i++ + i++;
        System.out.println(j +" " +i);
        Set<String> ansSet = new HashSet<>();
        ansSet.add("hello");
    }
}
