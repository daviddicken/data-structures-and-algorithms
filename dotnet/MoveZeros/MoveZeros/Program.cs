using System;

namespace MoveZeros
{
    public class Program
    {
        static void Main(string[] args)
        {
        }
        public static int[] MoveZeroes(int[] arr)
        {
            int c = 0, j = 0;
            int[] outArr = new int[arr.Length];
            for (int i = 0; i < arr.Length; i++)
            {
                if (arr[i] == 0)
                {
                    c++;
                }
                else
                {
                    outArr[i-c] = arr[i];
                }
            }
            return outArr;
        }
    }
}
