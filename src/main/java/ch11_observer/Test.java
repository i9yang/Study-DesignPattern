package ch11_observer;

/*
어떤 클래스에 변화가 일어났을 때, 다른 클래스에 통보해 주는 패턴입니다. 통보를 하는 "어떤 클래스"가 Observable 이고, 통보를 받는 "다른 클래스"는 Observer입니다. Observable은 여러개의 Observer를 가질 수 있습니다. Observable이 "담임 떴다"를 외치면, Observer은 알아서 그에 걸맞는 행동을 합니다. 어떤 Observer는 만화책을 덮고 교과서를 꺼내고 어떤 Observer는 흘린 침 닦고 일어나서 공부하는 척하고 또 어떤 Observer는 먹던 도시락 치우고 창문 열어 환기를 시킵니다. Observable은 "담임 떴다"까지만 알려주지 "담임 떴으니깐, 누구는 어찌하고 누구는 저찌해라~" 까지 상세한 지시는 하지 않습니다.
 */
public class Test {
    public static void main(String[] args) {
        Watcher watcher = new Watcher();
        Employee pc1 = new Employee("만화책보는 놈");
        Employee pc2 = new Employee("퍼질러 자는 놈");
        Employee pc3 = new Employee("포카치는 놈");
        //spy는 pc3을 보고 있음.
        //요놈은 꼰질르기의 대가
        Spy spy = new Spy(pc3);

        watcher.addObserver(pc1);
        watcher.addObserver(pc2);
        watcher.addObserver(pc3);
        watcher.addObserver(spy);

        watcher.action("사장 뜸.");
        watcher.deleteObserver(pc3);
        watcher.deleteObserver(spy);

        watcher.action("사장 뜸.");
    }
}
