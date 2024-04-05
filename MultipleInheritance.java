
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Barking..");
    }
}
class BabyDog extends Dog{
    void wipe(){
        System.out.println("Wiping...");
    }
}
public class MultipleInheritance {
    public static void main(String[] args){
        BabyDog b = new BabyDog();
        b.bark();
        b.eat();
        b.wipe();

    }
}
