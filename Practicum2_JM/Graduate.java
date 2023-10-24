package Practicum2_JM;

import java.util.Arrays;

public class Graduate extends AbstractClass{
    LetterGrade lg;
    int cre;
    Grade arr[] = new Grade[1];
    int pos = 0;

    public Graduate(String name, String id)
    {
        this.name = name;
        this.id= id;
    }
    @Override
    public String getEmail() {
        return id+"@grad.rit.edu";
    }

    @Override
    public void addGrade(Grade g)
    {
        if(pos<arr.length) {
            if(g.equals(LetterGrade.C_MINUS) || g.equals(LetterGrade.C_PLUS))
            {
                g= new Grade(LetterGrade.C, 2);
            }
            arr[pos] = g;
            pos++;
        }
        else {
            Arrays.copyOf(arr, pos + 1);
            if(g.equals(LetterGrade.C_MINUS) || g.equals(LetterGrade.C_PLUS))
            {
                g= new Grade(LetterGrade.C, 2);
            }
            arr[pos]=g;
        }
    }
    public String toString()
    {
        return "Graduate{ name="+getName()+", id="+getid()+", email="+getEmail()+", GPA="+calculateGPA()+"}";
    }




}
