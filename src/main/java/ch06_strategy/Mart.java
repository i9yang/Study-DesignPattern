package ch06_strategy;

public class Mart {
    private Seller seller;

    public Mart(Seller seller) {
        this.seller = seller;
    }

    public void order() {
        seller.sell();
    }
}
