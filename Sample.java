public class Sample {
    int id;
    String name;
}

// class TestStudent2{
//    public static void main(String[] args){
//        Sample s1 = new Sample();
//        s1.id=101;
//        s1.name="Gaffur";
//        System.out.println(s1.id+" "+s1.name);
//
//    }
// }

class TestStudent3{
    public static void main(String[] args){
        Sample s1 = new Sample();
        Sample s2 = new Sample();

        s1.id=101;
        s1.name="Nitish";
        s2.id=102;
        s2.name="Gaffur";
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }

}