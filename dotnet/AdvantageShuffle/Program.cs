using System;
using System.Collections.Generic;

namespace AdvantageShuffle
{
  class Program
  {
    static void Main(string[] args)
    {
      int[] arrA = new int[] { 12, 24, 8, 32 };
      int[] arrB = new int[] { 13, 25, 32, 11 };
      int[] endArr = new int[4];
      endArr = AdvantageCount(arrA, arrB);

    }
    public static int[] AdvantageCount(int[] A, int[] B)
    {

      List<int> list = new List<int>();
      int listSize = 0;

      for (int i = 0; i < A.Length; i++)
      {
        list.Add(A[i]);
        listSize++;
      }
      list.Sort();

      for (int i = 0; i < B.Length; i++)
      {
        int index = list.BinarySearch(B[i]);

        if (index > -1)
        {
          index = list.LastIndexOf(B[i]);
          if (index < listSize - 1)
          {
            A[i] = list[index + 1];
            list.RemoveAt(index + 1);
            listSize--;
          }
          else
          {
            A[i] = list[0];
            list.RemoveAt(0);
            listSize--;
          }
        }
        else
        {
          index = (index * -1) - 1;
          if (index == listSize)
          {
            A[i] = list[0];
            list.RemoveAt(0);
            listSize--;
          }
          else
          {
            A[i] = list[index];
            list.RemoveAt(index);
            listSize--;
          }
        }
      }
      return A;
    }
  }
}


// Passes 66 out of 67
//         SortedList<int, int> listA = new SortedList<int,int>();
//         int[] returnArr = new int[A.Length];

//         foreach(int val in A)
//         {
//             if(listA.IndexOfKey(val) > -1)
//             {
//                 listA[val] += 1;
//             }else
//             {
//                 listA.Add(val, 1);
//             }
//         }

//         int num = 0, low = 0;
//         for(int i = 0; i < B.Length; i++)
//         {
//             bool found = false, first = true;

//             foreach(KeyValuePair<int,int> pair in listA)
//             {

//                 if(first)
//                 {
//                     low = pair.Key;
//                     first = false;
//                 } 
//                 num = pair.Key;

//                 if(B[i] < pair.Key)
//                 {
//                     returnArr[i] = num;
//                     found = true;
//                     break;
//                 }
//             }
//             if(!found)
//             {
//                 returnArr[i] = low;
//                 if(listA[low] > 1)
//                 {
//                     listA[low] -= 1;
//                 }else
//                 {
//                     listA.Remove(low);
//                 }
//             }else
//             {
//                 if(listA[num] > 1)
//                 {
//                     listA[num] -= 1;
//                 }else
//                 {
//                     listA.Remove(num); 
//                 }                
//             }
//         }
//      return returnArr; 
//     }
// }

