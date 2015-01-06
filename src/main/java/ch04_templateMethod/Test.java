package ch04_templateMethod;

/*
전체적인 로직에는 큰 차이가 없지만 일부분만 바뀌는 비스무레한 몇 가지 클래스가 있다고 칩시다. 일부분을 위해서 전체를 새로 작성할 필요는 없지요. Template Method에서는 전반적인 구현은 상위클래스(주로 Abstract로 만듭니다.)에서 담당하고 부분적인 곳의 구체적인 구현은 하위클래스가 담당합니다.
 */
public class Test {
    public static void main(String[] args) {
        Worker designer = new Designer();
        designer.work();

        Worker gamer = new Gamer();
        gamer.work();
    }
}
