// Problem B: Interface Trainable with method trainAthlete(). Implemented by SwimCoach.
//
// This one is worked as an example of the pattern. Read it, understand it,
// then be ready in the viva to explain:
//   - why main() declares the variable as type Trainable rather than SwimCoach
//   - what you gain by "programming to the interface"

interface Trainable {
    void trainAthlete(String athleteName);
}

class SwimCoach implements Trainable {
    private String name;
    private String stroke;

    public SwimCoach(String name, String stroke) {
        this.name = name;
        this.stroke = stroke;
    }

    @Override
    public void trainAthlete(String athleteName) {
        System.out.println("Coach " + name + " is training " + athleteName
                + " in the " + stroke + " stroke.");
    }
}

public class ProblemB {
    public static void main(String[] args) {
        // TODO: replace with the data assigned to YOUR roll number
        Trainable coach = new SwimCoach("REPLACE_NAME", "REPLACE_STROKE");

        coach.trainAthlete("REPLACE_ATHLETE_1");
        coach.trainAthlete("REPLACE_ATHLETE_2");
    }
}
