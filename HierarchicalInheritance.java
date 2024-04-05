
class Anime {
    void food(){
        System.out.println("Food....");
    }
}
class Duck extends Anime{
    void quack() {
        System.out.println("quack...");
    }
}
class Cat extends Anime{
    void meow(){
        System.out.println("Meow.....");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args){
        Cat c = new Cat();
        c.meow();
        c.food();
    }
}
