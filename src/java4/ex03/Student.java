package java4.ex03;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList = new ArrayList<Subject>();
    public static final int BASIC = 0;
    public static final int MAJOR = 1;


    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int scorePoint, Grade grade) {
        this.subjectList.add(new Subject(name, scorePoint, grade));
    }

    public void showGradeInfo() {
        for (int i=0; i<subjectList.size(); ++i) {
            Subject subject = subjectList.get(i);

            System.out.print("학생 "+studentName+"의 ");
            System.out.print(subject.getName());
            System.out.print(" 과목 성적은 ");
            System.out.print(subject.getScorePoint());
            System.out.print("점 이고, 학점은 ");
            System.out.print(subject.getGrade().grading(subject));
            System.out.println(" 입니다.");
        }
    }
}
