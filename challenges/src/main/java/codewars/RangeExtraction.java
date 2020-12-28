package codewars;

public class RangeExtraction {

    public static String rangeExtraction(int[] arr) {
            if(arr.length == 0) return "";
            int start, end;
            String rtnStr = "";
            boolean isNew = true;

            for(int i = 0; i < arr.length; i++){
                start = arr[i];
                end = arr[i];

                do{
                    if(i+1 == arr.length) return buildStr(rtnStr, start, end, isNew);
                    if(end + 1 != arr[i+1]) break;
                    end = arr[i+1];
                    i++;
                }while(true);

                rtnStr = buildStr(rtnStr, start, end, isNew);
                isNew = false;
            }
            return rtnStr;
        }

//-----------
    public static String buildStr(String rtnStr, int start, int end, boolean newStr){
        if(!newStr) rtnStr += ",";
        switch(end - start) {
            case 0:
                return rtnStr += start;
            case 1:
                return rtnStr += start + "," + end;
            default:
                return rtnStr += start + "-" + end;
        }
    }
}

