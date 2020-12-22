package codewars;

public class InsaneColouredTriangles {
    public static char triangle(final String row) {




     return '?';
    }

    //-----------------

    public static char getColor(char a, char b){
        if(a == b) return a;
        int c = a, d = b;
        switch(c + d){
            case 137: return 'R';
            case 153: return 'B';
            case 148: return 'G';
            default: return 'E';
        }
    }

}

//============== zombie code =========================
//----------------------------------------
//     StringBuilder str = new StringBuilder(row);
//     int end = str.length()-1;
//     while(str.length() > 1){
//       for(int i = 0; i < str.length()/2; i++){
//         end = str.length()-(i+1);
//         str.setCharAt(i, getColor(str.charAt(i), str.charAt(i+1)));
//         str.setCharAt(end, getColor(str.charAt(end), str.charAt((end)- 1)));
//       }
//       str.deleteCharAt(str.length()/2);


//     }
//     return str.charAt(0);
//---------------------------------------
//       while(str.length() > 1){
//       for(int i = 0; i < str.length()-1; i++){
//         str.setCharAt(i, getColor(str.charAt(i), str.charAt(i+1)));
//       }
//       str.deleteCharAt(str.length()-1);

//     }
//     return str.charAt(0);
//---------------------------------------This works but times out
//     char[] arr = row.toCharArray();
//     if(arr.length < 2) return arr[0];
//     while(arr[1] != 'E'){
//       for(int i = 0; i < arr.length - 1; i++){
//         arr[i] = getColor(arr[i], arr[i + 1]);
//       }
//       arr[arr.length -1] = 'E';
//     }
//     return arr[0];

//---------------------------------------- Works
//        char[] arr = row.toCharArray();
//        if(arr.length < 2) return arr[0];
//        int mid = arr.length/2, countUp = 0, j = 0;
//
//        while(arr[1] != 'E'){
//
//            for(int i = 0; i < arr.length/2; i++){
//                j = i;
//                while(j < arr.length/2){
//
//                    if(arr[j+1] == 'E' && arr[arr.length -1] != 'E'){
//                        arr[j] = getColor(arr[j], arr[mid]);
//                    }else if(arr[j+1] == 'E' && arr[arr.length -1] == 'E'){
//                        arr[j] = 'E';
//                        continue;
//                    }else{
//                        arr[j] = getColor(arr[j], arr[j+1]);
//                    }
//                    j++;
//                }
//
//                //--------------
//                if(arr.length - 1 == 'E') continue;
//                arr[arr.length - (i+1)] = getColor(arr[arr.length - (i+1)],arr[arr.length - (i+2)]);
//            }//end of for
//            if(arr[arr.length -1] != 'E'){
//                arr[mid + countUp] = 'E';
//                countUp++;
//            }
//
//        }
//        return arr[0];
//----------------------------------------
//     char[] arr = row.toCharArray();
//     int end = arr.length - 1, toEnd = arr.length/2, toFront = toEnd - 1, skip = 0;
//     while(arr[1] != 'E'){
//       for(int i = 0; i < arr.length-1; i++{///2; i++){

//         if(arr[i+1] == 'E' && arr[arr.length - 1] != 'E'){
//           arr[i] = getColor(arr[i], arr[i+skip]);
//           i +=skip;
//         }else if()
//         arr[i] = getColor(arr[i], arr[i+1]);

//         if(toEnd < arr.length){
//           end = arr.length - (i+1);
//           arr[end] = getColor(arr[end], arr[end-1]);
//         }

//       }
//       if(toEnd < arr.length){
//         arr[toEnd] = 'E';
//         toEnd++;
//         skip++;
//       }else{
//         arr[toFront] = 'E';
//         toFront--;
//       }

//     }//while end
//     return arr[0];

//----------------------------------------
//     char[] arr = row.toCharArray();
//     if(arr.length == 1) return arr[0];
//     if(arr.length == 2) return getColor(arr[0], arr[1]);
//     int j = arr.length - 1, mid = arr.length/2;

//     //===============================
//     for(int i = 0; i > arr.length - 1; i++){


//     }


//     //===============================
//     while(arr[1] != 'E'){

//     for(int i = 0; i <= mid; i++){

// //       if(arr[i+1] == 'E'){
// //         arr[i] = 'E';
// //         continue;
// //       }
//       if(arr[mid - 1] == 'E'){
//         arr[i] = getColor(arr[i], arr[i+1]);
//         continue;
//       }

//       if(arr[j-1] == 'E'){
//         arr[j-1] = arr[j];
//         arr[j] = 'E';
//       }

//       arr[i] = getColor(arr[i], arr[i+1]);

//       System.out.println("before " + j);
//       if(j == mid){
//         System.out.println("in " + j);
//         arr[j] = 'E';
//       }else{
//         arr[j] = getColor(arr[j], arr[j-1]);
//       }
//       if(j > mid) j--;

//     }// end of for
//     }// while
//     for(int i =0; i < arr.length; i++){
//       System.out.print(arr[i]);
//     }