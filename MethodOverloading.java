class Adder{
   static int add (int a, int b){
        return a+b;
    }
   static double add (double a, double b, double c){
        return a+b+c;
    }
}
public class MethodOverloading {
    public static void main(String[] args){
        System.out.println(Adder.add(12,13));
        System.out.println(Adder.add(15.5,22.6,12.4));
    }
}
