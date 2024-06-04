package java4.ex03;

public class Subject {
    private String name;
    private int scorePoint;
    private Grade grade;

    public Subject() {
    }
    public Subject(String name, int scorePoint, Grade grade){
        this.name = name;
        this.scorePoint = scorePoint;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScorePoint() {
        return scorePoint;
    }
    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
    public Grade getGrade() {
        return grade;
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
