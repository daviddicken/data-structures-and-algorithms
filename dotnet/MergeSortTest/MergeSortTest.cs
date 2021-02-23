using System;
using Xunit;
using MergeSort;

namespace MergeSortTest
{
  public class MergeSortTest
  {
    [Fact]
    public void HappyPath()
    {
      int[] test = new int[] { 8, 4, 23, 42, 16, 15 };
      int[] expected = new int[] { 4, 8, 15, 16, 23, 42 };
      Program.MergeSort(test);
      Assert.Equal(expected, test);
    }

    [Fact]
    public void ReverseSorted()
    {
      int[] test = new int[] { 20, 18, 12, 8, 5, -2 };
      int[] expected = new int[] { -2,5,8,12,18,20 };
      Program.MergeSort(test);
      Assert.Equal(expected, test);
    }

    [Fact]
    public void FewUniques()
    {

      int[] test = new int[] { 5, 12, 7, 5, 5, 7 };
      int[] expected = new int[] { 5, 5, 5, 7, 7, 12 };

      Program.MergeSort(test);
      Assert.Equal(expected, test);
    }

    [Fact]
    public void NearlySorted()
    {

      int[] test = new int[] { 2, 3, 5, 7, 13, 11 };
      int[] expected = new int[] { 2, 3, 5, 7, 11, 13 };

      Program.MergeSort(test);
      Assert.Equal(expected, test);
    }
  }
}
