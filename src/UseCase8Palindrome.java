public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println("System initialized successfully.");
    }
}
