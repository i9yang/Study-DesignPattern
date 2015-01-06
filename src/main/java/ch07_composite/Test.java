package ch07_composite;

/*
파일 데이터와 같은 일반적인 트리 구조의 데이터 타입을 만드는 것이 Composite 패턴입니다. Composite 패턴에서 주요등장 인물은 3개입니다. 첫째는 상위 컴포넌트. 둘째는 상위 컴포넌트를 상속 받으며 자식 컴포넌트를 가질 수 있는 Composite. 세째는 상위 컴포넌트를 상속 받으며, 하위 컴포넌트를 가질 수 없는 Leaf. 디렉토리가 Composite라면, 파일은 Leaf라고 보시면 됩니다.
 */
public class Test {
    public static void main(String[] args) {

        Composite main = new Composite("Main");
        Composite sub1 = new Composite("sub1");
        Composite sub2 = new Composite("sub2");
        Composite sub11 = new Composite("sub11");
        Composite sub12 = new Composite("sub12");
        Composite sub13 = new Composite("sub13");
        Composite sub21 = new Composite("sub21");
        Composite sub22 = new Composite("sub22");
        Leaf leaf14 = new Leaf("leaf14");
        Leaf leaf121 = new Leaf("leaf121");

        main.add(sub1);
        main.add(sub2);
        sub1.add(sub11);
        sub1.add(sub12);
        sub1.add(sub13);
        sub2.add(sub21);
        sub2.add(sub22);
        sub1.add(leaf14);
        sub12.add(leaf121);

        System.out.println(main.getString());
    }
}