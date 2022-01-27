package WIX1003_FinalTest;

import java.util.Arrays;

/*
* Diving competition is a famous event in the Olympics.
* The organizer has appointed you to write a Java program
* that determine the winner of the event. Design a class
named Diving that consists of the following members:

▪ A field for the participant’s name.
▪ A field for the country.
▪ A field for the seven judges scores in 3 attempts.
▪ A field for the difficulty rating in 3 attempts.
▪ A constructor that contains the four arguments of the above fields.
▪ An accessor method for participant name and an accessor method for country.

▪ A method that returns the final score.
The score is calculated by removing the top two scores and the bottom two scores;
the remaining three scores are added together and multiplied by the difficulty rating in each attempt.
The final score is the sum of the total score in 3 attempts.

▪ A toString method that return participant profile, judges scores, difficulty rating and final score.
* */


public class Diving {
    private String participant_Name;
    private String country;
    private double[] judges_scores = new double[7];
    private int difficulty_Rating;

    public Diving() {
    }

    public Diving(String participant_Name, String country, double[] judges_scores, int difficulty_Rating) {
        this.participant_Name = participant_Name;
        this.country = country;
        this.judges_scores = judges_scores;
        this.difficulty_Rating = difficulty_Rating;
    }

    public String getParticipant_Name() {
        return participant_Name;
    }

    public void setParticipant_Name(String participant_Name) {
        this.participant_Name = participant_Name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double[] getJudges_scores() {
        return judges_scores;
    }

    public void setJudges_scores(double[] judges_scores) {
        this.judges_scores = judges_scores;
    }


    public int getDifficulty_Rating() {
        return difficulty_Rating;
    }


    public void setDifficulty_Rating(int difficulty_Rating) {
        this.difficulty_Rating = difficulty_Rating;
    }


    //toString method
    @Override
    public String toString() {
        return "Diving{" +
                "participant_Name='" + participant_Name + '\'' +
                ", country='" + country + '\'' +
                ", judges_scores=" + Arrays.toString(judges_scores) +
                ", difficulty_Rating=" + difficulty_Rating +
                '}';
    }

    //A method that returns the final score.
    public static double final_score(double[] judges_scores, int difficulty_Rating) {


        //sort the scores
        Arrays.sort(judges_scores);
        return (judges_scores[2] + judges_scores[3] + judges_scores[4]) * difficulty_Rating;

    }


}
