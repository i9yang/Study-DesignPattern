package ch06_strategy;

public class CupSeller implements Seller{
    @Override
    public void sell() {
        System.out.println("컵");
    }
}
