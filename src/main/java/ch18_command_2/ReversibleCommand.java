package ch18_command_2;

public interface ReversibleCommand {
    void redo();
    void undo();
}
