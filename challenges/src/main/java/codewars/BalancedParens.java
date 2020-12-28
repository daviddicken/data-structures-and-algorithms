package codewars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BalancedParens {
    //public static List<String> balancedParens (int n) {
    public static List<String> balancedParens (int n) {
        //==========================================




        //===========================================
        //ArrayList<String> returnArr = new ArrayList();
        HashSet<String> returnArr = new HashSet<>();
        StringBuilder str = new StringBuilder();
        StringBuilder singles = new StringBuilder();
        str.append("()");
        singles.append("()");

        for(int i = 0; i < n -1; i++){
            str.append('(');
            singles.append("()");
        }
        for(int i = 0; i < n - 1; i++){
            str.append(')');
        }
        System.out.println(str.toString());
        returnArr.add(str.toString());
        returnArr.add(singles.toString());

        for(int i = 1 ; i <= n; i++){
            char temp = str.charAt(i);
            str.setCharAt(i,str.charAt(i+1));
            str.setCharAt(i+1, temp);
            //System.out.println(str.toString());

            if(!returnArr.contains(str)) {
                System.out.println(str.toString());
                returnArr.add(str.toString());
            }
        }
        for(int i = n ; i < str.length() -1; i++){
            char temp = str.charAt(i);
            str.setCharAt(i,str.charAt(i-1));
            str.setCharAt(i-1, temp);
            //System.out.println(str.toString());

            if(!returnArr.contains(str)) {
                System.out.println(str.toString());
                returnArr.add(str.toString());
            }
        }


        return (List<String>) new ArrayList(returnArr);
    }
}
/*
str = "()"
for n-1 str += "("
for n-1 str += ")"
()(())
(()())
((()))  =
(()()) =
(())() =
 */
/*
()()()()
(()()())
(())(())
*/



// create array size of n * 2
// for n add "(" for n add ")" to string push string to string arr
// 3 ( ( ( ) )  )
//  0 1 2 3 4 5
// ( ) ( ( ) )
//  0 3 1 2 4 5
// ( ( ) ( ) )
// 0 1 3 2 4 5
//  ( ( )

// 3 ( ( ( ) )  )
//   0 1 2 3 4 5
//   ( ( ) ( ) )
//   ( ( ) ) ( )
//   ( ( ) ( ) )


//  ( ) ( ( ) )
//  0 3 1 2 4 5
// ( ( ) ( ) )
// 0 1 3 2 4 5
//  ( ( ) ) ( )

//  ( ( ) ) ( )

//-------------- Zombie code
// for(int i = 0; i < n; i++){
//        str.append('(');
//        }
//        for(int i = 0; i < n; i++){
//        str.append(')');
//        }
//        //System.out.println(str.charAt(1));
//        StringBuilder start = str;
//        returnArr.add(str.toString());
//
//
//        for(int i = n ; i > 1; i--){
//        char temp = str.charAt(i);
//        str.setCharAt(i,str.charAt(i-1));
//        str.setCharAt(i-1, temp);
//        //System.out.println(str.toString());
//
//        if(!returnArr.contains(str)) {
//        returnArr.add(str.toString());
//        }
//        }
//
//        // 3 ( ( ( ) ) )
//        //   0 1 2 3 4 5
//        //((())
//
//        for(int i = n; i < start.length() - 1; i++){
//        char temp = start.charAt(i);
//        start.setCharAt(i,start.charAt(i-1));
//        start.setCharAt(i-1, temp);
//        System.out.println(start.toString());
//
//        if(!returnArr.contains(start)) {
//        returnArr.add(str.toString());
//        }
//        }

// 3 ( ( ( ) ) )
//   0 1 2 3 4 5
//((())

//        for(int i = n; i < start.length() - 1; i++){
//            char temp = start.charAt(i);
//            start.setCharAt(i,start.charAt(i-1));
//            start.setCharAt(i-1, temp);
//            System.out.println(start.toString());
//
//            if(!returnArr.contains(start)) {
//                returnArr.add(str.toString());
//            }
//        }
// ( ( ( ) ) )
// 0 1 2 3 4 5
// ( ( ) ( ) )
//       0 1 2 3 4 5
//    ( ( ) ) ( )

//        ( ) ( ( ) )
//        ()()()
// [((())), (()()), ()(()), ()()()]
