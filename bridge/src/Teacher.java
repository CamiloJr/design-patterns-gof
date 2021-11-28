import Impl.Implementer;

public abstract class Teacher {

    protected Implementer implementer;

    protected Teacher(Implementer implementer) {
        this.implementer = implementer;
    }

    public abstract void operation();
}
