import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String firstString = scan.nextLine();
        System.out.println("Enter second string: ");
        String secondString = scan.nextLine();
        int fStringLength = firstString.length();
        int sStringLength = secondString.length();
        if (fStringLength> sStringLength) {
            System.out.println(firstString + " is longer");
        }
        else if (sStringLength>fStringLength) {
            System.out.println(secondString + "is longer");
        }
        else {
            System.out.println("Both strings have the same length");
        }
        System.out.println("First half: " + firstString.substring(0, (int) fStringLength/2));
        System.out.println("Second half: " + firstString.substring((int) ((int)(fStringLength/2)+0.5)));
        System.out.println("First half: " + secondString.substring(0, (int) sStringLength/2));
        System.out.println("Second half: " + secondString.substring((int) ((int)(sStringLength/2)+0.5)));
        if (firstString.indexOf(secondString)!=-1) {
            System.out.println(secondString + " is found in " + firstString + " at index " + firstString.indexOf(secondString));
        }
        else {
            System.out.println(secondString + " is NOT found in " + firstString);
        }


        


    }
    
}