package ch06_strategy;

/*
Template Method 패턴이 상속을 이용해서 어떤 구현을 했다면, Strategy 패턴은 구성을 이용합니다. Template Method와 마찬가지로 바뀌는 부분과 바뀌지 않는 부분을 나눠서 생각할 수 있습니다. Template Method가 하위 클래스에서 바뀌는 부분을 처리한다면 Starategy는 바뀌는 부분을 인터페이스로 분리하여 처리합니다. 그 인터페이스의 구현체를 바꿈으로서 로직을 변경하는 것입니다. 또 Template Method와 크게 다른 점은 Template Method에서는 외부로 공개되는 것이 Template Method를 가지고 있는 상위 클래스였지만, Strategy에서는 인터페이스를 사용하는 클래스(그 클래스를 Context라고 합니다.)입니다.
 */
public class Test {
    public static void main(String[] args) {
        Seller cupSeller = new CupSeller();
        Seller phoneSeller = new PhoneSeller();
        Mart mart1 = new Mart(cupSeller);
        mart1.order();
        Mart mart2 = new Mart(phoneSeller);
        mart2.order();
    }
}
