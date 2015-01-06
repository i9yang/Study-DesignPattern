package ch05_singleton;

/*
각종 설정 등이 저장된 클래스가 하나 있다고 칩시다. 프로그램 내에서 여기저기서 마구 접근해서 설정을 바꾸기도 하고 값을 가져오기도 합니다. 이런 클래스는 인스턴스를 하나만 가져야 합니다. 하나 만들어서 쓰는 곳마다 인자로 전달해주면 되긴 합니다만, 접근하는 곳이 많다면, 계속 인자로 전달하는 것은 그다지 바람직하지 않습니다. 전역변수처럼 아무곳에서나 이 인스턴스에 접근을 하면 편하겠죠. Singleton 패턴을 이용하면, 하나의 객체를 만들어서 아무데서나 접근할 수 있습니다.
 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.Amethod();
        t.Bmethod();

        t.Amethod2();
        t.Bmethod2();
    }

    public void Amethod() {
        SingletonCounter sc = SingletonCounter.getInstance();
        System.out.println("Amethod에서 카운터 호출 " + sc.getNextInt());
    }

    public void Bmethod() {
        SingletonCounter sc = SingletonCounter.getInstance();
        System.out.println("Bmethod에서 카운터 호출 " + sc.getNextInt());
    }

    public void Amethod2() {
        SingletonCounter3 sc = SingletonCounter3.getInstance();
        System.out.println("Amethod에서 카운터 호출 " + sc.getNextInt());
    }

    public void Bmethod2() {
        SingletonCounter3 sc = SingletonCounter3.getInstance();
        System.out.println("Bmethod에서 카운터 호출 " + sc.getNextInt());
    }

}
