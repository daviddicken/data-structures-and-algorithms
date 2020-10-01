package utilities;

public class MultiBracketValidation {
    public static void main(String[] args) {
        //System.out.println(multiBracketValidation("{{}}"));
        //System.out.println(bracketValid("{{{"))
//        System.out.println("Should be true: " + multiBV("{}"));
//        System.out.println("Should be false: " + multiBV("[{]}"));
//        System.out.println("Should be false: " + multiBV("["));
//        System.out.println("Should be true: " + multiBV("((((code fellows)))){}[]gdhx"));
//        System.out.println("Should be true: " + multiBV("kjhdsnjcdf"));
//        System.out.println("Should be false: " + multiBV("}kjhdsnjcdf"));

    }

    public static boolean multiBV(String input) {
        if(input.length() < 2){ return false; }
        if(input.charAt(0) == '}' || input.charAt(0) == ')' || input.charAt(0) == ']'){
            return false;
        }
        Q<Character> nextQ = new Q<>();
        char searchChar;
        int i = 0;
        int j;

        while(i < input.length()){
            searchChar = input.charAt(i);
            j = i + 1;

            if(j > input.length()){
                if (nextQ.size() > 0 || searchChar == '(' || searchChar == ')'
                    || searchChar == '{' || searchChar == '}'
                    || searchChar == '[' || searchChar == ']'){
                    return false;
                }else{
                    return true;
                }
            }

            do{
                if(nextQ.size() > 0 && j > input.length()){
                    return false;
                }
                if(nextQ.size() > 0){
                    searchChar = nextQ.dequeueFromFront();
                }
                while (j < input.length()){
                    if(doesBreak(searchChar, input.charAt(j))){
                        return false;
                    }
                    if(doesClose(searchChar, input.charAt(j))){
                        break;
                    }
                    if(searchChar == input.charAt(j)){
                        nextQ.enqueueToFront(input.charAt(j));
                    }

                 j++;
                }
                j++;
                i = j;
            }while (nextQ.size() > 0);
        }
    return true;
    }

    //====================== does close ======================
    public static boolean doesClose(char open, char close) {
        switch (open) {
            case '[':
                if (close == ']') {
                    return true;
                }
                return false;
            case '(':
                if (close == ')') {
                    return true;
                }
                return false;
            case '{':
                if (close == '}') {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }


    //====================== does break ======================
    public static boolean doesBreak(char open, char close) {
        switch (open) {
            case '[':
                if (close == '{' || close == '}' || close == '(' || close == ')') {
                    return true;
                }
                return false;
            case '(':
                if (close == '{' || close == '}' || close == '[' || close == ']') {
                    return true;
                }
                return false;
            case '{':
                if (close == '[' || close == ']' || close == '(' || close == ')') {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    //======================================================================
    public boolean multiBracketValidation(String input) {
        Q<Character> open = new Q<>();
        int i = 0;
        char c;

        if (input.length() < 0) {
            return false;
        }

        while (i < input.length()) {
            c = input.charAt(i);
            // if(Pattern.matches("[({[]^", c){}
            if (c == '[' || c == '(' || c == '{') {

                open.enqueueToFront(c);


            } else if (c == ']' || c == ')' || c == '}') {

                if (c == ']' && open.peek().equals('[')) {
                    open.dequeueFromFront();
                } else if (c == ')' && open.peek().equals('(')) {
                    open.dequeueFromFront();
                } else if (c == '}' && open.peek().equals('{')) {
                    open.dequeueFromFront();
                } else {

                    return false;
                }


                i++;
            }
            if (open.size() > 0) {
                return false;
            }
        }
        return true;
    }

    public boolean bracketValid(String input){
        int i = 0;
        char searchChar;
        boolean isTrue;

        while (i < input.length()){
            searchChar = input.charAt(i);
                if (searchChar == '[' || searchChar == '(' || searchChar == '{'){
                    isTrue = switchTest(searchChar, input, i);

                    if(isTrue == false){
                        return false;
                    }
                }
        i++;
        }

     return true;
    }


    public static boolean switchTest(char searchChar, String input, int index) {
        int j = 0;


        while (index < input.length()) {
            //searchChar = input.charAt(index);

           // if (searchChar == '[' || c == '(' || c == '{') {
                j = index + 1;

                switch (searchChar) {
                    case '[':
                        while (j < input.length()) {
                            if (input.charAt(j) == '(' || input.charAt(j) == '{') {
                                return false;
                            } else if (input.charAt(j) == ']') {
                                break;
                            } else if (input.charAt(j) == '[') {
                                switchTest(searchChar,input, j);
                            }
                            j++;
                        }
                    break;
                case '(':
                    while (j < input.length()) {
                        if (input.charAt(j) == '[' || input.charAt(j) == '{') {
                            return false;
                        } else if (input.charAt(j) == ')') {
                            break;
                        } else if (input.charAt(j) == '(') {
                            switchTest(searchChar,input, j);
                        }
                        j++;
                    }
                    return false;
                case '{':
                    while (j < input.length()) {
                        if (input.charAt(j) == '[' || input.charAt(j) == '(') {
                            return false;
                        } else if (input.charAt(j) == '}') {
                            break;
                        } else if (input.charAt(j) == '{') {
                            switchTest(searchChar,input, j);
                        }
                        j++;
                    }
                    return true;
                default:
                    break;
                }
            }
        return false;
        }
    }

