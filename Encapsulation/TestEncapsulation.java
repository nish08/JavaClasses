package Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAcc_no(123456789);
        acc.setName("Nitish Bisen");
        acc.setEmail("xyz@gmail.com");
        acc.setAmount(100000f);
        System.out.println("Account No:"+acc.getAcc_no() + " Name: "+acc.getName() + " Email: "+acc.getEmail() + " Amount: "+acc.getAmount());
    }
}
