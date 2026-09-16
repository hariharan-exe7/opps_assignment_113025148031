class InvalidExperienceException extends Exception {
    public InvalidExperienceException(String message) {
        super(message);
    }
}

public class ExperienceValidator {
    static void checkExperience(int years) throws InvalidExperienceException {
        if (years < 0) {
            throw new InvalidExperienceException(
                "Invalid input: Years of experience cannot be negative (" + years + ")");
        }
        System.out.println("Valid experience entered: " + years + " year(s)");
    }

    public static void main(String[] args) {
        int[] testInputs = { 5, -3 };
        for (int years : testInputs) {
            try {
                checkExperience(years);
            } catch (InvalidExperienceException e) {
                System.out.println("Exception Caught: " + e.getMessage());
            }
        }
    }
}
