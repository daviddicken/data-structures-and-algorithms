using System;

namespace MergeSort
{
  public class Program
  {
    static void Main(string[] args)
    {
			//int[] test = new int[] { 8, 4, 23, 42, 16, 15 };
			//MergeSort(test);
			//foreach(int num in test)
   //   {
   //     Console.WriteLine(num);
   //   }
		}

		/// <summary>
		/// MergeSort recursivly split a unsorted array of ints until the length of the array segments are equal to 1. 
		/// </summary>
		/// <param name="arr">array of int's</param>
		public static void MergeSort(int[] arr)
		{
			int n = arr.Length;

			if (n > 1)
			{
				int mid = n / 2;

				int[] left = new int[mid];
				int[] right = new int[arr.Length - mid];

				Array.Copy(arr, 0, left, 0, mid);
				Array.Copy(arr, mid, right, 0, arr.Length - mid);
       
				MergeSort(left);
				MergeSort(right);

				 Merge(left, right, arr);
			}
		}


		/// <summary>
		/// Merge takes in 3 int arrays. Iterating through the first two placing the lowest value into the third array.
		/// </summary>
		/// <param name="left"> array of int's</param>
		/// <param name="right"> array of int's</param>
		/// <param name="arr"> array of int's</param>
		public static void Merge(int[] left, int[] right, int[] arr)
		{
			int i = 0, j = 0, k = 0;

			while (i < left.Length && j < right.Length)
      {
				if(left[i] <= right[j])
        {
					arr[k] = left[i];
					i++;
        }
        else
				{
					arr[k] = right[j];
					j++;
        }
				k++;
      }
			if(i == left.Length)
      {
				while(j < right.Length)
        {					
					arr[k] = right[j];
					j++;
					k++;
        }
      }
			else
      {
				while(i < left.Length)
        {
					arr[k] = left[i];
					i++;
					k++;
        }
      }
		}
	}
}
