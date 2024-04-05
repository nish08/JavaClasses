public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int fib=a+b;

        while (fib < 100){
        int pre = b;
        System.out.println(fib+" ");
            b=fib;
            fib +=pre;
       }

    }
}




