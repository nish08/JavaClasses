class Bank{
    int RateofInterest () {
        return 0;
    }
}
class SBI extends Bank{
    int RateOfInterest() {
        return 7;
    }
}
class ICIC extends Bank{
    int RateOfInterest(){
        return 8;
    }
}
class Axis extends Bank{
    int RateOfInterest(){
        return 9;
    }
}
public class BankOverriding {
public static void main(String[] args){
    Axis a = new Axis();
    ICIC i = new ICIC();
    SBI s = new SBI();

    System.out.println("SBI:"+s.RateOfInterest());
    System.out.println("ICICI:"+i.RateOfInterest());
    System.out.println("Axis:"+a.RateOfInterest());
}
}
