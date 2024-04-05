public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id+ " " +name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
    public static void main(String[] args){
        Address address1 = new Address("Nagpur","Maharshtra","India");
        Address address2 = new Address("Vijaywada","Andhra Pradesh", "India");
        addAddress("ABC","xyz","pqr");

        Emp e = new Emp(111,"Nitish",address1);
        Emp e2 = new Emp(112,"Gaffur",address2);

        e.display();
        e2.display();
    }
    public static void addAddress(String city,String state,String country){
        System.out.println(city+" "+state+" "+country);
    }

}