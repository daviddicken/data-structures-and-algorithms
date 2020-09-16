package challenges;

public class BinarySearch {
    //https://www.javatpoint.com/binary-search-in-java
    public int indexSearch(int[] array, int key)
    {
        int first = 0;
        int last = array.length - 1;
        int mid = (first + last) / 2;

        while(first <= last)
        {
            if(array[mid] == key)
            {
                return mid;
            }
            else if(array[mid] < key)
            {
                first = mid + 1;
            }
            else
            {
                last = mid - 1;
            }
            mid = (first + last)/ 2;
        }
        return -1;
    }
}
