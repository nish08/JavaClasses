package Arrays;

public class Test {
    public static void main(String[] args) {
        // int i [] = new int [5];
//        int i [];
//        i = new int[5];
//        i[0] = 50;
//        i[1] = 60;
//        i[2] = 70;
//        i[3] = 80;
//        i[4] = 90;
        int[] marks = {50, 60, 70, 80, 90};
//        System.out.println(i.length);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        //Reverse Order of Array
        System.out.println("Reverse Order");
        for (int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        //for each loop
        System.out.println("for each loop");
        for (int element:marks){
            System.out.println(element);
        }
    }
}
