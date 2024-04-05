package Polymorphism;

class Bike {
    void run(){
        System.out.println("Running");
    }
}
public class Splendor extends Bike {
    void run() {
        System.out.println("It is running at 60km");
    }

    public static void main(String[] args) {
        Bike b = new Splendor();
        b.run();

    }
}