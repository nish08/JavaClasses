package Polymorphism;

import org.w3c.dom.ls.LSOutput;

class Bank{
    float getRateOfInterest(){
        return (0);
    }
}
class SBI extends Bank{
    float getRateOfInterest() {
        return 6.5F;
    }
}
class Axis extends Bank{
    float getRateOfInterest() {
        return 7.5F;
    }
}
class HDFC extends Bank{
    float getRateOfInterest(){
        return (8.5f);
    }
}
public class BankPoly {
    public static void main(String[] args){
        Bank b;
         b = new SBI();
        System.out.println("SBI rate of interest:" +b.getRateOfInterest());

        b=new Axis();
        System.out.println("Axis rate of interest:" +b.getRateOfInterest());

        b = new HDFC();
        System.out.println("HDFC rate of interest:" +b.getRateOfInterest());
         }
    }

