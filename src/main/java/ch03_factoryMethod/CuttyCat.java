package ch03_factoryMethod;

public class CuttyCat extends Cat {
    private Cat cat;

    public CuttyCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void printDescription() {
        System.out.print("귀엽게 ");
        cat.printDescription();
    }
}
