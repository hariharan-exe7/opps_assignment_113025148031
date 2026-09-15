// Problem C: Custom exception InvalidExperienceException, thrown when years
// of experience is entered as negative.
//
// TODO: fill in the bodies below yourself. Be ready in the viva to explain:
//   - why this extends Exception (checked) rather than RuntimeException (unchecked)
//   - what that forces callers of your method to do
//   - what super(message) does here

class InvalidExperienceException extends Exception {
    public InvalidExperienceException(String message) {
        // TODO: pass message up to Exception's constructor
    }
}

class ExperienceValidator {
    public void setExperience(String coachName, int years) throws InvalidExperienceException {
        // TODO: if years < 0, throw new InvalidExperienceException(...) with a useful message
        // TODO: otherwise, accept the value (store it / print confirmation)
    }
}

public class ProblemC {
    public static void main(String[] args) {
        ExperienceValidator validator = new ExperienceValidator();

        // TODO: replace with the data assigned to YOUR roll number
        // include at least one negative value so the exception path is exercised
        int[] inputs = { /* REPLACE with your values, e.g. 12, -5, 7 */ };

        for (int years : inputs) {
            try {
                validator.setExperience("REPLACE_NAME", years);
            } catch (InvalidExperienceException e) {
                System.out.println("Caught InvalidExperienceException -> " + e.getMessage());
            }
        }
    }
}
