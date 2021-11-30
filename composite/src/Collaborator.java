public abstract class Collaborator {
    protected String name;
    protected double salary;

    public Collaborator(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void showCollaborator();
    public abstract void add(Collaborator collaborator);
    public abstract void remove(Collaborator collaborator);
}
