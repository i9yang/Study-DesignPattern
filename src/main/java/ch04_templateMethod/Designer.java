package ch04_templateMethod;

public class Designer extends Worker {
    @Override
    protected void doit() {
        System.out.println("디자인!");
    }
}
