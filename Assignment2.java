import java.util.Scanner;
import java.util.Arrays;

/*
 * This class will print the Hello World 
 */
public class Assignment2 {//proper naming conventions is used 

	public static void main(String[] args)// Main methods starts
    {String theWord;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string to rearrange: \n");

    theWord = in.nextLine();
    int length = theWord.length();
    System.out.println("Length of string: "+length);
    char[] chars=theWord.toCharArray();
    Arrays.sort(chars);
    String newWord=new String(chars);

    System.out.println("The Re-Arranged word : "+newWord);// printing 

}
}// class closed
