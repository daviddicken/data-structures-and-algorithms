package codewars;

public class ProductFib {
    public static long[] productFib(long prod) {

        long fib1 = 0, fib2 = 1, fib3 = 1;
        do{
            if(fib1 * fib2 == prod) return new long[]{fib1, fib2, 1};
            if(fib2 * fib3 > prod) return new long[]{fib2, fib3, 0};
            fib1 = fib2;  fib2 = fib3;  fib3 = fib1 + fib2;
        }while(true);
    }
}

