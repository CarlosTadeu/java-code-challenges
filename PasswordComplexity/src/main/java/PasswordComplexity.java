import java.util.Scanner;

public class PasswordComplexity {

    public static boolean isPasswordComplexRegex(String password) {
        return password.length() >= 6 &&
                password.matches(".*\\d.*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*");
    }

    public static boolean isPasswordComplex(String password) {
        if (password == null || password.length() < 6) {
            return false;
        }

        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                isDigit = true;
            if (Character.isUpperCase(password.charAt(i)))
                isUpperCase = true;
            if (Character.isLowerCase(password.charAt(i)))
                isLowerCase = true;
        }
        return isDigit && isUpperCase && isLowerCase;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? " +
                isPasswordComplex(userInput));
    }
}
