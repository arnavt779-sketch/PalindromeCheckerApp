import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerUC6 {

    public static void main(String[] args) {
        String word = "level";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is not a palindrome.");
        }
    }
}
