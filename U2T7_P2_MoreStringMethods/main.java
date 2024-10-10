package U2T7_P2_MoreStringMethods;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;     
        String word = " ";
        String first = word.substring(0,1);
        int temp = 0;
        System.out.println("Enter first word: ");
        word = scanner.nextLine();
        System.out.println("Enter next word: ");
        String nextWord;
        nextWord = scanner.nextLine();
        String firstword = word.substring(word.length()-2);
        if (nextWord.compareTo(word)>-1) {
            score =+2;
            System.out.println("+2 points: current word alphabethically after; SCORE: " + score);
        }        
        else if (nextWord.compareTo(word)<-1) {
            score=-5;
            System.out.println("-5 points: current word alphabethically before; SCORE: " + score);
        }
        else {
            score=-10;
            System.out.println("-10 points: current word alphabethically before; SCORE: " + score);
        }
        
        if ((word.substring(word.length()-2)).equals(nextWord.substring(0,2))) {
            score=+5;
                System.out.println("+5 points: last 2 letters of previous match first 2 letters of current; SCORE:"  + score);
        }
        if (nextWord.indexOf(first)>-1) {
            score=+3;
        System.out.println("+3 points: first letter of previous word is found in current word; SCORE:"  + score);
    }
    System.out.println(score);
    }
}

            
        
        
