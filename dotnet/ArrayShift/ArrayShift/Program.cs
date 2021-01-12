using System;

namespace ArrayShift
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] test = new int[5] { 1, 2, 4, 5, 7};
            int[] arr = ArrayShift(test, 3);

            foreach(int num in arr)
            {
                Console.WriteLine(num);
            }
        }

        public static int[] ArrayShift(int[] arr, int value)
        {
            int[] returnArr = new int[arr.Length + 1];
            int middle = returnArr.Length / 2, j = 0;
            
            for (int n = 0; n < returnArr.Length; n++)
            {
                if (n == middle)
                {
                    returnArr[n] = value;
                    j--;
                }
                else
                {
                    returnArr[n] = arr[j];
                }
                j++;
            }
            return returnArr;
        }


    }
}
