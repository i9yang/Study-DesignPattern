package ch13_flyweight;

import java.util.HashMap;
import java.util.Map;

/*
Flyweight 는 동일한 것을 공유해서 객체 생성을 줄여 가볍게 만드는 것입니다. 클래스 별로 factory를 씁니다. 그리고 그 factory에서는 자신이 찍어내는 객체들을 관리합니다. 이미 가지고 있는 객체에 대한 요청이 들어왔을 때는 관리하고 있던 객체를 던져주고, 가지고 있지 않은 것을 요청하면 새로 객체를 만들어 관리 리스트에 추가시키고 던져줍니다.
 */
public class PersonFactory {
    private static Map<String, Person> map = new HashMap<String, Person>();

    public synchronized static Person getPerson(String name) {
        if (!map.containsKey(name)) {
            Person tmp = new Person(name);
            map.put(name, tmp);
        }
        return map.get(name);
    }

    public static class Person {
        private final String name;

        private Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

