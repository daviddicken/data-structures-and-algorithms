package codewars;

public class Snail {

    public static int[] snail(int[][] array) {
        int l = array[0].length, ll = l * l, index = 0, min = 0, max = l;
        int[] arr = new int[ll];

        while (index < ll) {
            for (int i = min; i < max; i++) {
                arr[index] = array[min][i];
                index++;
                if (index == ll) return arr;
            }
            for (int i = min + 1; i < max; i++) {
                arr[index] = array[i][max - 1];
                index++;
                if (index == ll) return arr;
            }
            max--;
            for (int i = max - 1; i >= min; i--) {
                arr[index] = array[max][i];
                index++;
                if (index == ll) return arr;
            }
            for (int i = max -1; i >= min + 1; i--) {
                arr[index] = array[i][min];
                index++;
                if (index == ll) return arr;
            }
            min++;
        }
        return arr;
    }
}