package Abstraction;

abstract class Bike{
    abstract void run();
}
public class Honda extends Bike {
    void run() {
        System.out.println("Honda.....");
    }
    public static void main(String[] args) {
        Bike b = new Honda();
        b.run();
    }
}
