package challenges;

public class ArrayShift {
    public int[] arrayShift(int[] orgArr, int value)
    {
        int[] newArr = new int[orgArr.length + 1];
        int midIndex;
        int j = 0;

        if(orgArr.length % 2 == 0)
        {
            midIndex = orgArr.length / 2;
        }else {
            midIndex = orgArr.length / 2 + 1;
        }

        for(int i = 0; i < newArr.length; i++)
        {
            if(i == midIndex)
            {
                newArr[i] = value;
            }else
            {
                newArr[i] = orgArr[j];
                j++;
            }
        }
        return newArr;
    }

}
