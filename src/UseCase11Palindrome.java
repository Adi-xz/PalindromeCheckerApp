import java.util.stream.IntStream;

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "rotator";

        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        boolean isPalindrome = IntStream.range(0, cleaned.length() / 2)
                .allMatch(i -> cleaned.charAt(i) == cleaned.charAt(cleaned.length() - i - 1));

        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println("System initialized successfully.");
    }
}
