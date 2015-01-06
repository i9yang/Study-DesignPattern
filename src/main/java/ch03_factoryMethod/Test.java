package ch03_factoryMethod;

/*
factory는 공장이죠. 객체를 막 찍어내는 놈입니다. 객체 선언은 보통 new 객체() 이런식으로 하죠. factory는 내부에서 그런 일을 해줍니다. 즉 factory를 가져다가 쓰는 부분에서는 new 객체()와 같은 식으로 변수를 선언할 필요가 없습니다. Abstract class나 인터페이스에 대해서 다양한 하위 구현체가 있을 경우에 사용하면 좋습니다. 사용법은 Factory.create(인자는 맘대로) 와 같이 됩니다.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Animal animal;

        animal = AnimalFactory.create("소");
        animal.printDescription();
        animal = AnimalFactory.create("개");
        animal.printDescription();
        animal = AnimalFactory.create("고양이");
        animal.printDescription();

        animal = AnimalFactory.create("귀여운고양이");
        animal.printDescription();

        System.out.println("-------------------------------");

        animal = AnimalFactory.create2("ch03_factoryMethod.Dog");
        animal.printDescription();
    }
}
