package ch02_adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/*
이미 구현되어 있는 코드가 있는데, 둘이 연결 좀 시켜주고 싶을 때가 있죠. 어떤 좋은 메쏘드가 있는데, 인자로 A라는 형식을 받습니다. 근데, 이미 구현되어 있는 코드에는 B라는 형식으로 구현되어 있습니다. 이럴 때, B를 A의 형식으로 바꿔주면 좋은 메쏘드를 써먹을 수 있습니다. Adapter 패턴은 어떤 오브젝트를 캐스팅이 불가능한 다른 클래스의 형태로 변환시켜주는 것입니다.
 */
public class Test {
    public static void goodMethod(Enumeration<String> enu) {
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("이은결");
        list.add("Kevin parker");
        list.add("David Blaine");
        Enumeration<String> ite = new IteratorToEnumeration(list.iterator());
        Test.goodMethod(ite);
    }
}
