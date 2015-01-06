package ch15_mediator;

public class ControlTower {
    private volatile boolean inUse;

    public synchronized boolean getPermission() {
        if (inUse) {
            return false;
        } else {
            inUse = true;
            return true;
        }
    }

    public void land(Airplane airplane) throws InterruptedException {
        int seq = airplane.getSeq();
        System.out.println(seq + "번 비행기 착륙 시작");
        Thread.sleep(50L);
        System.out.println(seq + "번 비행기 착륙 끝");
        inUse = false;
    }
}
