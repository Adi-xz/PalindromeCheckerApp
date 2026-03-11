import java.text.Normalizer;

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "ÁmanaplanacanalPanamá";

        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "")
                .toLowerCase();

        String reversed = new StringBuilder(normalized).reverse().toString();

        System.out.println("Input String: " + input);
        System.out.println("Normalized String: " + normalized);

        if (normalized.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println("System initialized successfully.");
    }
}
