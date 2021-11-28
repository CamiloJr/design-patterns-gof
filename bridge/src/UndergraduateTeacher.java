import Impl.Implementer;

public class UndergraduateTeacher extends Teacher{

    protected UndergraduateTeacher(Implementer implementer) {
        super(implementer);
    }

    public void operation() {
        System.out.println("Local modifications of the operation...");
        implementer.operationImplementer();
    }
}
