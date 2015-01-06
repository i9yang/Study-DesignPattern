package ch15_mediator;

/*
Mediator 패턴은 관제탑과 같이 통신을 집중시킴으로써 통신의 경로를 줄이고 단순화시키는 역할을 합니다.
 */
public class Test {
    public static void main(String[] args) {
        ControlTower tower = new ControlTower();
        Airplane[] airplanes = new Airplane[10];
        for (int i = 0; i < airplanes.length; i++) {
            airplanes[i] = new Airplane(tower, i);
        }
        for (Airplane airplane : airplanes) {
            airplane.start();
        }
    }
}
