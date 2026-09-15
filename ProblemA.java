// Problem A: Coach class with (name, sport) + constructor.
// Subclass HeadCoach adds yearsOfExperience. Use super() for constructor chaining.
//
// TODO: fill in the bodies below yourself. Be ready in the viva to explain:
//   - why super(...) must be the first statement in HeadCoach's constructor
//   - what happens if you leave it out
//   - why displayDetails() in HeadCoach calls super.displayDetails() instead
//     of printing the parent's fields directly

class Coach {
    private String name;
    private String sport;

    public Coach(String name, String sport) {
        // TODO: assign fields
    }

    // TODO: add getters if you need them

    public void displayDetails() {
        // TODO: print name and sport
    }
}

class HeadCoach extends Coach {
    private int yearsOfExperience;

    public HeadCoach(String name, String sport, int yearsOfExperience) {
        // TODO: call super(...) first, then set yearsOfExperience
    }

    @Override
    public void displayDetails() {
        // TODO: call super.displayDetails(), then print yearsOfExperience
    }
}

public class ProblemA {
    public static void main(String[] args) {
        // TODO: replace with the data assigned to YOUR roll number
        Coach c = new Coach("REPLACE_NAME", "REPLACE_SPORT");
        HeadCoach hc = new HeadCoach("REPLACE_NAME", "REPLACE_SPORT", 0 /* REPLACE_YEARS */);

        c.displayDetails();
        hc.displayDetails();
    }
}
