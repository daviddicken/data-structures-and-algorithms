using System;

namespace ArrayReverse
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] test = ReverseArray(new int[] { 1, 2, 3, 4, 5 });
            foreach (int num in test) Console.Write($"{num}, ");
        }

        static int[] ReverseArray(int [] input)
        {
            int[] returnArr = input;
            int temp = 0, size = returnArr.Length - 1;

            for (int i = 0; i < returnArr.Length / 2; i++)
            {
                temp = returnArr[i];
                returnArr[i] = returnArr[size - i];
                returnArr[size - i] = temp;
            }
            return returnArr;
        }
    }
}
