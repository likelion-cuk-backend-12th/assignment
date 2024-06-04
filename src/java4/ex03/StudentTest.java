package java4.ex03;

public class StudentTest {
    public static void main(String[] args) {
        Grade majorGrade = new MajorGrade();
        Grade notMajorGrade = new NotMajorGrade();

        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100, notMajorGrade);
        studentLee.addSubject("수학", 100, majorGrade);

        Student studentKim = new Student(1002, "Kim");

        studentKim.addSubject("국어", 55, majorGrade);
        studentKim.addSubject("수학", 55, notMajorGrade);
        studentKim.addSubject("영어", 100, notMajorGrade);

        studentLee.showGradeInfo();
        System.out.println("======================================");
        studentKim.showGradeInfo();
    }
}
