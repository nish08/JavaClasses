package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationCheck {
    public static void main(String[] args) {
        String str = "ABC";
        char[] ans = str.toCharArray();
        List<String > ansList = new ArrayList<>();
        int headPoint = 0;
        int tailPoint = str.length();
        for (int i =0 ; i<str.length();i++){
            headPoint =i;
            tailPoint = str.length()-1;
            while (headPoint<tailPoint){
                char temp = ans[headPoint];
                ans[headPoint] = ans[headPoint+1];
                ans[headPoint+1] = temp;
                ansList.add(Arrays.toString(ans));
                headPoint++;
            }
            if (headPoint==tailPoint){
                char temp = ans[headPoint-(str.length()-1)];
                ans[headPoint-(str.length()-1)] = ans[headPoint];
                ans[headPoint] = temp;
                ansList.add(Arrays.toString(ans));
            }
            System.out.println(ans);
        }
    }
}
