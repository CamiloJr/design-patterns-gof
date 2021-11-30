public class Developer extends Collaborator {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    public void showCollaborator() {
        System.out.println(super.name + ", $" + super.salary);
    }

    public void add(Collaborator collaborator) {
        System.out.println("It is not possible to add additional subordinate contributors to the developer.");
    }

    public void remove(Collaborator collaborator) {
        System.out.println("It is not possible to remove additional subordinate contributors to the developer.");
    }
}
