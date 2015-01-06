package ch13_flyweight;

import ch13_flyweight.PersonFactory.Person;

public class Test {
    public static void main(String[] args) {
        Person p1 = PersonFactory.getPerson("홍길동");
        Person p2 = PersonFactory.getPerson("김말자");
        Person p3 = PersonFactory.getPerson("홍길동");
        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
    }
}

