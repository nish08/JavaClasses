package Exceptionhandlings;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime number upto 10");
        for (int i=2; i<10; i++){
            boolean isPrime = true;
            for (int j=2; j<=i/2;j++){
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }
    }
}
