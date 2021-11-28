import Impl.*;

public class Main {

    public static void main(String[] args) {

        Teacher undergraduateTeacher = new UndergraduateTeacher(new UndergraduateTeacherImpl());
        undergraduateTeacher.operation();

        Teacher graduateTeacher = new GraduateTeacher(new GraduateTeacherImpl());
        graduateTeacher.operation();
    }
}
