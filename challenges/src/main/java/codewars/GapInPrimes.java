package codewars;

public class GapInPrimes {
    //("[101, 103]", Arrays.toString(GapInPrimes.gap(2,100,110)));

    public static long[] gap(int g, long m, long n) {
        long[] arr = getPrimes(m);

        do {
            if (arr[1] - arr[0] == g) {
                return arr;
            }
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
        System.out.println("NUMBER " + num + "------------------");
        if(num == 2 || num == 3 || num == 5){
            return true;
        }
        if(num % 2 == 0){
            System.out.println("Returned false even number");
            return false;
        }

        double root = Math.sqrt(num);
        System.out.println("Root " + root);
        int divideBy = 3;

        while(divideBy <= root){
            System.out.println("DivideBy " + divideBy);
            System.out.println("The Math = " + num % divideBy);
            if(num % divideBy == 0){
                System.out.println("Returned false");
                return false;
            }
            divideBy += 2;
        }
        System.out.println("Returned true************************");
        return true;
    }
}
//   long primeA = 0, primeB = 0, num = m;
//
//        do{ // need to keep primeA at 103 second time through check if primeA isPrime??
//            while(primeA == 0){
//                if(isPrime(num)){
//                    primeA = num;
//                }
//                num++;
//            }
//            while(primeA > primeB){
//                if(isPrime(num)){
//                    primeB = num;
//                }
//                num++;
//            }
//            System.out.println("primeA " + primeA +" primeB " + primeB);
//            System.out.println(primeB - primeA);
//            if(primeB - primeA == g){
//                System.out.println("should be returning");
//                long[] arr = new long[]{primeA, primeB};
//                return arr;
//            }
//            primeA = primeB;
//            //isPrime(m) ? primeA = m : m++;
//        }while(primeA < n);
//
//        return null;

//=========================================================
// return long[]{prime1, prime2};
//       long[] returnArr = new long[2];
//       long firstPrime = 0, secondPrime = 0, start = m;
//       double root = 0;
//       int counter = 0;
//       boolean flag = false;
//       //int gap = 0;

//       if(m == 2 || m == 3 || m == 5){
//           firstPrime = m;
//         }

//       do{
//         while(firstPrime == secondPrime && start != n){
//           counter = 3;
//           flag = true;
//           root = Math.sqrt(start);

//           while(flag == true && counter < root){
//             System.out.println("start " + start + "  Root " + root + "counter " + counter);
//             System.out.println(start % counter);

//             if(start % counter == 0 || start % 2 == 0){
//               flag = false;
//             }
//             counter = counter + 2;
//           }

//           //if(start % 2 == 0 || start % 3 == 0 || start % 5 == 0){
//           if(flag == false){
//             start++;
//           }else{
//             firstPrime = start;
//             start++;
//             //secondPrime = 0;
//           }
//         }
//         //start++;
//         //gap++;
// //--------------------------------------------------------
//         while(firstPrime > secondPrime && start != n){
//           counter = 3;
//           flag = true;
//           root = Math.sqrt(start);

//           while(flag == true && counter < root){
//             if(start % counter == 0 || start % 2 == 0){
//               flag = false;
//             }
//             counter = counter + 2;
//           }

//           //if(start % 2 == 0 || start % 3 == 0 || start % 5 == 0){
//           if(flag = false){
//             start++;
//             flag = true;
//             //gap++;
//           }else{
//             secondPrime = start;
//           }
//         }
//         if(secondPrime - firstPrime == g && start != n){
//           returnArr[0] = firstPrime;
//           returnArr[1] = secondPrime;
//           return returnArr;
//         }else{
//           //gap = 0;
//           firstPrime = 0;
//           secondPrime = 0;

//         }
//       }while(start != n);