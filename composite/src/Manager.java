import java.util.ArrayList;

public class Manager extends Collaborator {

    private ArrayList<Collaborator> collaboratorList = new ArrayList<Collaborator>();

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void showCollaborator() {
        System.out.println(super.name + ", $" + super.salary);
        for(Collaborator collaborator: collaboratorList) {
            collaborator.showCollaborator();
        }
    }

    public void add(Collaborator collaborator) {
        collaboratorList.add(collaborator);
    }

    public void remove(Collaborator collaborator) {
        collaboratorList.remove(collaborator);
    }
}
