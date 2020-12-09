package codewars;

public class CarMileage {
    public static int isInteresting(int number, int[] awesomePhrases) {
        if(checkNum(number, awesomePhrases)) return 2;
        if(checkNum(++number, awesomePhrases)
                || checkNum(++number, awesomePhrases)) return 1;
        return 0;
    }

    //-------------------
    public static boolean checkNum(int num, int[] arr){

        String str = Integer.toString(num);
        if(str.length() < 3) return false;
        String a = str.replaceAll("0+","");

        if(str.length() > 1 && a.length() == 1
                || (isSame(str) || isInc(str)
                || isDec(str) || isPal(str)
                || contains(arr, num))) return true;

        return false;
    }
    //-------------------
    public static boolean contains(int[]arr, int num){
        for(int n : arr){
            if(n == num) return true;
        }
        return false;
    }
    //-------------------
    public static boolean isPal(String num){
        for(int i = 0; i < num.length()/2;i++){
            if(num.charAt(i) != num.charAt(num.length() - (i+1))) return false;
        }
        return true;
    }
    //-------------------
    public static boolean isDec(String num){
        for(int i = 0; i < num.length() - 1; i++){
            int j = Character.getNumericValue(num.charAt(i));
            int k = Character.getNumericValue(num.charAt(i + 1));

            if(j == 0) return false;
            if(k != j - 1) return false;
        }
        return true;
    }
    //-------------------
    public static boolean isInc(String num){
        for(int i = 0; i < num.length() - 1; i++){
            int j = Character.getNumericValue(num.charAt(i));
            int k = Character.getNumericValue(num.charAt(i + 1));

            if(j == 9){
                if(k != 0){
                    return false;
                }else{
                    continue;
                }
            }
            if(k != j+1) return false;
        }
        return true;
    }
    //-------------------
    public static boolean isSame(String num){
        for(int i = 0; i < num.length() - 1; i++){
            if(num.charAt(i) != num.charAt(i+1)) return false;
        }
        return true;
    }
}