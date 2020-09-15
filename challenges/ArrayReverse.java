public class ArrayReverse
{

  public static void main(String[] args)
  {
    int [] orgArray = new int[]{1,2,3,4,5};

    int [] reversedArray = reversed(orgArray);

  }

  public static int[] reversed(int[] array) 
  {
    int[] newArray = new int[array.length];
    int j = 0;

    for(int i = array.length - 1; i >= 0; i--)
    {
      newArray[j] = array[i];
      System.out.println(newArray[j]);
      j++;
    }

  return newArray;
  }



}