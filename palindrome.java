
//Write a code to check if the given string is a palindrome or not

package basic_lvl;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String input = scanner.nextLine();
      if (isPalindrome(input)) {
          System.out.println("The string is a palindrome.");
      } else {
          System.out.println("The string is not a palindrome.");
      }
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
	public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

