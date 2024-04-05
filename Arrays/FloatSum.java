package Arrays;

public class FloatSum {
    public static void main(String[] args) {

        //problem 1
       /* float [] marks = {68.68f,98.20f,78.52f,65.25f,80.00f};
        float sum = 0;
        for (float adds:marks){
            sum = sum + adds;
        }
        System.out.println("The sum is:"+sum);
        */
        //problem 2
        int [] marks = {58,68,98,56,45};
        int num = 56;
        boolean isInArray = false;
        for (int element:marks){
            if (num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The array is present");
        }else {
            System.out.println("The array is not present");
        }
    }
}