package ch18_command_2;

public class Test {
    public static void main(String[] args) {
        Panel panel = new Panel();
        CommandStack cs = new CommandStack();
        cs.execute(new PanelChangeCommand(panel, "주황"));
        cs.execute(new PanelChangeCommand(panel, "노랑"));
        cs.execute(new PanelChangeCommand(panel, "초록"));

        System.out.println("--undo 2번--");
        cs.undo();
        cs.undo();
        cs.undo();
        System.out.println("--redo 1번--");
        cs.redo();
        cs.execute(new PanelChangeCommand(panel, "파랑"));
    }
}
