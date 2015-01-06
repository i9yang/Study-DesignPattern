package ch14_builder;

public class BatmanBuilder implements Builder{
    private Hero batman;
    BatmanBuilder(){
        this.batman = new Hero("배트맨");
    }

    @Override
    public void makeArm() {
        batman.setArmSource("돈지랄");
    }

    @Override
    public void makeLeg() {
        batman.setLegSource("돈지랄");
    }

    @Override
    public Hero getResult() {
        return batman;
    }
}
