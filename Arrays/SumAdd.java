package Arrays;

public class SumAdd {
    public static void main(String[] args) {
        int [] marks = {80,75,95,87,65};
        int sum = 0;
        for (int i:marks){
            sum = sum + i;
        }
        System.out.println(sum/marks.length);
    }
}
