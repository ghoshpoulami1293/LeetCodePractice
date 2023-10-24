package Practicum2_JM;

import java.util.Arrays;

public abstract class AbstractClass implements Student{
    String name;
    String id;
    LetterGrade lg;
    int cre;
    Grade arr[] = new Grade[1];
    int pos = 0;
    public String getName() {
        return name;
    }

    @Override
    public String getid() {
        return id;
    }
    @Override
    public Grade[] getGrades() {
        return Arrays.copyOf(arr,pos);
    }

    @Override
    public double calculateGPA()
    {
        double sum=0;
        double tcre=0;
        for(Grade i: getGrades())
        {
            Grade g = new Grade(lg,cre);
            sum += g.getScore();
            tcre+= cre;
        }
        return sum/tcre;
    }
}
