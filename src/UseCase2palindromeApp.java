
public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {
        // Hardcoded input string
        String input = "madam";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Input String: " + input);

        // Check if input matches reversed string
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
        
        System.out.println("System initialized successfully.");
    }
}
