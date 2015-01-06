package ch03_factoryMethod;

public class AnimalFactory {
    public static Animal create(String animalName){
        if(animalName == null){
            throw new IllegalArgumentException("null은 안됨");
        }

        if(animalName.equals("소")) {
            return new Cow();
        } else if(animalName.equals("고양이")) {
            return new Cat();
        } else if(animalName.equals("개")) {
            return new Dog();
        } else if(animalName.equals("귀여운고양이")) {
            return new CuttyCat(new Cat());
        } else {
            return null;
        }
    }

    public static Animal create2(String animalName) throws Exception {
        if(animalName == null){
            throw new IllegalArgumentException("null은 안됨");
        }

        Class<?> clazz = Class.forName(animalName);
        return (Animal) clazz.newInstance();
    }
}
