package codewars;

//You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes
// too early to an appointment, so you decided to take the opportunity to go for a short walk. The city
// provides its citizens with a Walk Generating App on their phones -- everytime you press the button it
// sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']).
// You always walk only a single block for each letter (direction) and you know it takes you one minute to
// traverse one city block, so create a function that will return true if the walk the app gives you will
// take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to
// your starting point. Return false otherwise.

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int N = 0;
        int S = 0;
        int E = 0;
        int W = 0;

        if(walk.length != 10){
            return false;
        }
        for(char direction : walk){
            switch(direction){
                case 'n':
                    N++;
                    break;
                case 's':
                    S++;
                    break;
                case 'e':
                    E++;
                    break;
                case 'w':
                    W++;
                    break;
            }
        }

        if(N == S && E == W){
            return true;
        }

        return false;
    }
}