package ch05_singleton;

public class SingletonCounter3 {
    private volatile static SingletonCounter3 singleton;
    private int cnt = 0;

    private SingletonCounter3() {
    }

    public static SingletonCounter3 getInstance() {
        if(singleton == null) {
            synchronized (SingletonCounter3.class) {
                if(singleton == null) {
                    singleton = new SingletonCounter3();
                }
            }
        }

        return singleton;
    }

    public int getNextInt() {
        return ++cnt;
    }
}
