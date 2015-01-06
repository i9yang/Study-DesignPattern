package ch06_strategy;

public class PhoneSeller implements Seller{
    @Override
    public void sell() {
        System.out.println("폰");
    }
}
