public class PalindromeCheckerUC9 {

    public static void main(String[] args) {
        String word = "level";
        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println("The string \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is not a palindrome.");
        }
    }

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }
}
