public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;
        int start = 0;
        int end = cleaned.length() - 1;

        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input Phrase: " + input);
        System.out.println("Cleaned Phrase: " + cleaned);

        if (isPalindrome) {
            System.out.println("Result: The phrase is a Palindrome.");
        } else {
            System.out.println("Result: The phrase is NOT a Palindrome.");
        }

        System.out.println("System initialized successfully.");
    }
}
