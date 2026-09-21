// Demonstrating Exception Handling in Java:
// try, catch, finally, throw, and custom exceptions

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    // Method that throws a custom exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register!");
        }
        System.out.println("Age verification successful: " + age);
    }

    public static void main(String[] args) {
        // Handling built-in runtime exception (ArithmeticException)
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed for arithmetic test.");
        }

        System.out.println("-----------------------------------");

        // Handling custom checked exception
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed for age test.");
        }
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)
