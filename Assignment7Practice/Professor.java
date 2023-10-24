package Assignment7Practice;

public class Professor {
    private String firstname;
    private String lastName;
    private String universityName;
    private String subject;
    private double defaultValue= 3.0;
    private double averageRating= 0.0;
    private double ratingOverallQuality;
    private double ratingLevelOfDifficulty;
    private int countOfRatings=1;

    public Professor(String name, String lastName, String universityName, String subject, double ratingOverallQuality,
            double ratingLevelOfDifficulty) {
        this.firstname = name;
        this.lastName = lastName;
        this.universityName = universityName;
        this.subject = subject;
        this.ratingOverallQuality = ratingOverallQuality;
        this.ratingLevelOfDifficulty = ratingLevelOfDifficulty;
        this.averageRating = (this.ratingOverallQuality+ this.ratingLevelOfDifficulty)/2;
    }
    
    public Professor(String name, String lastName, String universityName, String subject) {
        this.firstname = name;
        this.lastName = lastName;
        this.universityName = universityName;
        this.subject = subject;
        this.ratingOverallQuality = defaultValue;
        this.ratingLevelOfDifficulty = defaultValue;
        this.averageRating = (this.ratingOverallQuality+ this.ratingLevelOfDifficulty)/2;
    }

    public String getFirstName() {
        return firstname;
    }
    public void setName(String name) {
        this.firstname = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUniversityName() {
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public double addRating(double ratingOverallQuality, double ratingLevelOfDifficulty){
        double totalOverallRating = this.ratingOverallQuality * countOfRatings + ratingOverallQuality;
        double totalDifficultyRating = this.ratingLevelOfDifficulty * countOfRatings + ratingLevelOfDifficulty;
        countOfRatings++;

        this.ratingOverallQuality = totalOverallRating / countOfRatings;
        this.ratingLevelOfDifficulty = totalDifficultyRating / countOfRatings;
        this.averageRating = (this.ratingOverallQuality+ this.ratingLevelOfDifficulty)/2;
        return averageRating;
    }
    

    @Override
    public String toString() {
        return "Professor [firstname= " + firstname + 
                        ", lastName= " + lastName + 
                        ", universityName= " + universityName +
                        ", subject=" + subject + 
                        ", defaultValue=" + defaultValue + 
                        ", ratingOverallQuality= " + ratingOverallQuality + 
                        ", ratingLevelOfDifficulty=" + ratingLevelOfDifficulty + 
                        ", averageRating =" + this.averageRating +
                        "]";
    }    
}
