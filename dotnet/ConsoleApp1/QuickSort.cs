using System;

namespace QuickSort
{
  public class QuickSortClass
  {
    static void Main(string[] args)
    {
      int[] test = new int[] { 8, 4, 23, 42, 16, 15 };
      QuickSort(test);

      foreach(int num in test)
      {
        Console.WriteLine(num);
      }
    }

    /// <summary>
    /// Main QuickSort Method takes in a unsorted array of ints and passes it to the quickSort helper method with a 0 index value and array length - 1 as the other two parameters
    /// </summary>
    /// <param name="arr">int array</param>
    public static void QuickSort(int[] arr)
    {
      QuickSort(arr, 0, arr.Length - 1);
    }

    /// <summary>
    /// QuickSort helper method takes in a int array and and left and right int values representing left and right index. It will call the Partition Mtehod that will return a new left index value. That value will be used to call quickSort recursively until the array is sorted
    /// </summary>
    /// <param name="arr">int array</param>
    /// <param name="left">int</param>
    /// <param name="right">int</param>
    private static void QuickSort(int[] arr, int left, int right)
    {
      if(left < right)
      {
        int position = Partition(arr, left, right);
        QuickSort(arr, left, position - 1);
        QuickSort(arr, position + 1, right);
      }
    }

    /// <summary>
    /// Partition takes in a int array and two int values representing left and right index values of the section of the array we need to sort through. It creates a pivot and iterates through that section of the array calling the swap value method to swap any values less then the pivot to the left of it. 
    /// </summary>
    /// <param name="arr">array of int</param>
    /// <param name="left">int</param>
    /// <param name="right">int</param>
    /// <returns></returns>
    private static int Partition(int[] arr, int left, int right)
    {
      int pivot = arr[right];
      int low = left - 1;

      for(int i = left; i < right; i++)
      {
        if(arr[i] <= pivot)
        {
          low++;
          Swap(arr, i, low);
        }
      }
      Swap(arr, right, low + 1);
      return low + 1;
    }

    /// <summary>
    /// Swap method swaps two index values
    /// </summary>
    /// <param name="arr">int array</param>
    /// <param name="i">int</param>
    /// <param name="low">int</param>
    private static void Swap(int[] arr, int i, int low)
    {
      int temp = arr[i];
      arr[i] = arr[low];
      arr[low] = temp;
    }
  }
}
