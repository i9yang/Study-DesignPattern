package ch09_chainOfResponsibility;

public class Fighter extends Expert {
    public Fighter() {
        this.expertName = "격투가";
    }

    @Override
    protected boolean solve(Problem p) {
        return p.getProblemName().contains("깡패");
    }
}
