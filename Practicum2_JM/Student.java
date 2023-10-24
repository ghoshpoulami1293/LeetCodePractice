package Practicum2_JM;

public interface Student
{
    public String getName();
    public String getid();
    public String getEmail();

    public void addGrade(Grade g);
    public Grade[] getGrades();
    public double calculateGPA();
}
