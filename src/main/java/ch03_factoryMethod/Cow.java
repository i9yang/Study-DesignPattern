package ch03_factoryMethod;

public class Cow implements Animal{
    @Override
    public void printDescription() {
        System.out.println("음머~");
    }
}
