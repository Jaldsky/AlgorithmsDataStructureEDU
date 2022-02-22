package singleton;

public class DemandHolderSingleton {
    private DemandHolderSingleton() {}

    private static class SingletonHolder {
        private final static DemandHolderSingleton instance = new DemandHolderSingleton();
    }

    public static DemandHolderSingleton getInstance() {
        return SingletonHolder.instance;
    } //В данном случае мы полностью решили проблему
    // ленивой инициализации – объект инициализируется при
    // первом вызове метода getInstance(). Но у нас осталась
    // проблема с обработкой исключительных ситуаций в
    // конструкторе. Так что, если конструктор класса не
    // вызывает опасений создания исключительных ситуаций,
    // то смело можно использовать этот метод.
}
