package Practicum2_JM;;

/**
 * Represents the possible grades that a student may earn.
 */
public enum LetterGrade {
    A(4.0),
    A_MINUS(3.67),
    B_PLUS(3.33),
    B(3.0),
    B_MINUS(2.67),
    C_PLUS(2.33),  // Considered C for Grads
    C(2.0),
    C_MINUS(1.67), // Considered C for Grads
    D(1.0),
    F(0),
    P(0),  // Pass - not included in GPA
    S(0);  // Satisfactory - not included in GPA

    /**
     * The number of points that this grade contributes to a student's GPA.
     */
    private final double points;

    /**
     * Constructor implicitly invoked when each enum is created.
     *
     * @param points The points that this grade contributes to a student's
     *               GPA.
     */
    LetterGrade(double points) {
        this.points = points;
    }

    public double getPoints() {
        return points;
    }
}
