package codewars;

public class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        long[] arr = getPrimes(m);

        do {
            if (arr[1] - arr[0] == g) return arr;
            arr = getPrimes(arr[1]);

        }while(arr[1] <= n);
        return null;
    }

    public static long[] getPrimes(long num){
        long[] arr = new long[2];

        do {
            arr[0] = num;
            num++;
        }while(!isPrime(arr[0]));

        do {
            arr[1] = num;
            num++;
        }while (!isPrime(arr[1]));

        return arr;
    }

    public static boolean isPrime(long num){
        if(num == 2 || num == 3 || num == 5) return true;

        if(num % 2 == 0) return false;

        double root = Math.sqrt(num);
        int divideBy = 3;

        while(divideBy <= root){
            if(num % divideBy == 0) return false;
            divideBy += 2;
        }
        return true;
    }
}
