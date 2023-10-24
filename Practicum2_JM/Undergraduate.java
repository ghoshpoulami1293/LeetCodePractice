package Practicum2_JM;
import java.util.Arrays;

public class Undergraduate extends AbstractClass
{
    String name;
    String id;
    LetterGrade lg;
    int cre;
    Grade arr[] = new Grade[1];
    int pos = 0;

    @Override
    public String getEmail() {
        return id+"@ug.rit.edu";
    }

    @Override
    public void addGrade(Grade g) {
        if(pos<arr.length) {
            arr[pos] = g;
            pos++;
        }
        else {
            Arrays.copyOf(arr, pos + 1);
            arr[pos]=g;
        }
    }


    public String toString()
    {
        return "Undergraduate{ name="+getName()+", id="+getid()+", email="+getEmail()+", GPA="+calculateGPA()+"}";
    }
}
