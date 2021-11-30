import java.util.ArrayList;

public class Invoker {

    private ArrayList<Command> commands = new ArrayList<Command>();
    private int current = 0;

    public void compute(Command command) {
        command.execute();
        commands.add(command);
        current++;
    }

    public void undo(int level) {
        for(int i = 0; i < level; i++) {
            Command command = commands.remove(--current);
            command.undo();
        }
    }
}
