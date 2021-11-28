import Impl.Implementer;

public class GraduateTeacher extends Teacher {

    protected GraduateTeacher(Implementer implementer) {
        super(implementer);
    }

    public void operation() {
        System.out.println("Local modifications of the operation...");
        implementer.operationImplementer();
    }
}
