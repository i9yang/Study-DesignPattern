package ch14_builder;

public interface Builder {
    void makeArm();
    void makeLeg();
    Hero getResult();
}
