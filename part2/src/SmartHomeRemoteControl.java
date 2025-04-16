import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class SmartHomeRemoteControl {
    private Map<String, Command> slots = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void setCommand(String slot, Command command) {
        slots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = slots.get(slot);
        if (command != null) {
            command.execute();
            history.push(command);
        } else {
            System.out.println("[Remote] No command set for slot: " + slot);
        }
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            System.out.println("Undo last command");
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }
}
