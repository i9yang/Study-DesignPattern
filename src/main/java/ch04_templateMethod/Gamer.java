package ch04_templateMethod;

public class Gamer extends Worker {
    @Override
    protected void doit() {
        System.out.println("게임!");
    }
}
