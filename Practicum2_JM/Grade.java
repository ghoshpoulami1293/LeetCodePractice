package Practicum2_JM;;

public class Grade 
{
    LetterGrade letter;
    int credits;
    //Fill in your implementation
    public Grade(LetterGrade lg, int credits)
    {
        this.letter= lg;
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public LetterGrade getLetter() {
        return letter;
    }
    public boolean includeGPA()
    {
        return letter != LetterGrade.P && letter!= LetterGrade.S;
    }
    public double getScore()
    {
        if(includeGPA())
            return credits*letter.getPoints();
        return 0;
    }
    public String toString()
    {
        return "letter="+getLetter() +", points="+ letter.getPoints()+", credits="+credits+", score="+getScore();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Grade))
            return false;
        Grade gr = (Grade)obj;
        return credits == gr.credits && letter == gr.letter;
    }
}
