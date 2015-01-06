package ch18_command_2;

import java.util.ArrayList;
import java.util.List;

public class CommandStack {
    private int current = -1;
    private List<ReversibleCommand> commands = new ArrayList<ReversibleCommand>();

    public void execute(ReversibleCommand c) {
        //System.out.println(commands.size()-1 +"," +  current);
        for (int i = commands.size() - 1; i > current; i--) {
            commands.remove(i);
        }
        commands.add(c);
        redo();
    }

    public void redo() {
        commands.get(++current).redo();
    }

    public void undo() {
        commands.get(current--).undo();
    }
}