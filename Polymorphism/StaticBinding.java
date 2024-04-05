package Polymorphism;

public class StaticBinding {
    private void eat(){
        System.out.println("eating..");
    }

    public static void main(String[] args) {
        StaticBinding sb = new StaticBinding();
        sb.eat();
    }
}
