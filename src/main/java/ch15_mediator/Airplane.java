package ch15_mediator;

public class Airplane extends Thread{
    private final ControlTower tower;
    private final int seq;

    public Airplane(ControlTower tower, int seq) {
        this.tower = tower;
        this.seq = seq;
    }

    public int getSeq() {
        return seq;
    }

    @Override
    public void run() {
        try {
            while (!tower.getPermission()) {
                //System.out.println(seq +"번 째 비행기 대기 중.");
                Thread.sleep(10L);
            }
            tower.land(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
