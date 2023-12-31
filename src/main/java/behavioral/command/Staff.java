package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private static List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommand() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
