package singleton;

public class AdvanceMultithreadingSingleton {
    private static AdvanceMultithreadingSingleton instance;

    private AdvanceMultithreadingSingleton() {}

    public static synchronized AdvanceMultithreadingSingleton getInstance() {
        if (instance == null) {
            instance = new AdvanceMultithreadingSingleton();
        }
        return instance;
    } //У этого варианта есть только один недостаток.
    // Синхронизация полезна только один раз, при первом
    // обращении к getInstance(), после этого каждый раз,
    // при обращении этому методу, синхронизация просто
    // забирает время.
}
