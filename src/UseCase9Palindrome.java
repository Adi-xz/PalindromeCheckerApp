public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "kayak";

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println("System initialized successfully.");
    }

    public static boolean checkPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return checkPalindrome(str, start + 1, end - 1);
    }
}
