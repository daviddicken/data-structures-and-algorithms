package leftJoin;

import java.util.*;

public class LeftJoin {

    String [][] returnArr;
    public String [][] leftJoin(HashMap tableA, HashMap tableB){
        
        returnArr = new String[tableA.size()][];
        List<String> keys = new ArrayList<>(tableA.keySet());
        
        for(int i = 0; i < tableA.size(); i++){
          returnArr[i] = new String[3];
          returnArr[i][0] = keys.get(i);
          returnArr[i][1] = tableA.get(keys.get(i)).toString();

          if(tableB.containsKey(keys.get(i))){
              returnArr[i][2] = tableB.get(keys.get(i)).toString();
          }
        }
        return returnArr;
    }

    //========= ToString ===============
    @Override
    public String toString(){
        String string = "[";

        for(int i = 0; i < returnArr.length; i++ ){
            string += "[";
            for(int j = 0; j < returnArr[i].length;j++){
                if(j > 0){
                    string += ", ";
                }
                string += returnArr[i][j];
            }
            string += "]";
        }
        string += "]";

        return string;
    }
}
