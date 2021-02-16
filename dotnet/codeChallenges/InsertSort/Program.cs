using System;

namespace InsertSort
{
    public class Program
    {
        static void Main(string[] args)
        {
            //int[] test = new int[] { 8, 4, 23, 42, 16, 15 };
            //int[] sorted = InsertSort(test);

            //foreach ( int num in sorted)
            //{
            //    Console.WriteLine(num);
            //}
            
        }

        /* InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
        */
        /// <summary>
        /// InsertSort takes in a unsorted array of integers and iterates through the array moving the smaller values to the left until the array is sorted.
        /// </summary>
        /// <param name="arr">array of int's</param>
        /// <returns>sorted array of int's</returns>
        public static int [] InsertSort(int[] arr)
        {
            for(int i = 1; i < arr.Length; i++)
            {
                int j = i - 1;
                int temp = arr[i];

                while(j >= 0 && temp < arr[j])
                {
                    arr[j + 1] = arr[j];
                    j -= 1;
                }
                arr[j + 1] = temp;
            }
            return arr;
        }
    }
}
