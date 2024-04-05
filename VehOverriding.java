public class VehOverriding {
    void run(){
        System.out.println("vehicle is running smoothly");
    }
}
class Biker extends VehOverriding{
    void run(){
        System.out.println("Bike is running perfectly");
    }
    public static void main (String[] args){
        Biker bik = new Biker();

        bik.run();
    }
}
