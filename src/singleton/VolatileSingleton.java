package singleton;

public class VolatileSingleton {
    private static volatile VolatileSingleton instance;

    private VolatileSingleton() {}

    public static VolatileSingleton getInstance() {
        if (instance == null)
            synchronized (VolatileSingleton.class) {
            if (instance == null)
                instance = new VolatileSingleton();
            }
        return instance;
    } //Не смотря на то, что этот вариант выглядит как идеальное
    // решение, использовать его не рекомендуется т.к.
    // товарищ Allen Holub заметил, что использование volatile
    // модификатора может привести к проблемам
    // производительности на мультипроцессорных системах.
}
