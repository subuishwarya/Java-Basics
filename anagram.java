/*n anagram is a word or phrase formed by rearranging the letters of another word or phrase, typically using all the original letters exactly once. In other words, anagrams are words or phrases that contain the same set of letters but arranged in a different order.

For example:

"listen" and "silent" are anagrams of each other.
"debit card" and "bad credit" are anagrams of each other.
"astronomer" and "moon starer" are anagrams of each other.
*/
package basic_lvl;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase to ignore case and spaces
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If the lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays to check for anagrams
        return Arrays.equals(charArray1, charArray2);
    }
}
