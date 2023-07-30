
//Write a code to reverse a number

package basic_lvl;
import java.util.Scanner;
public class reverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.next();
        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);
        scanner.close();

	}
	public static String reverseString(String str) {
        int length = str.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

}
