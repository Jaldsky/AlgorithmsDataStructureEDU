package singleton;

public class SimpleMultithreadingSingleton {
    private static SimpleMultithreadingSingleton instanse = new SimpleMultithreadingSingleton();

    private SimpleMultithreadingSingleton() {}

    public static SimpleMultithreadingSingleton getInstance() {
        return instanse;
    } //Решение подходит для многопоточных приложений,
    // при условии отсутствия опасности возникновения
    // исключительных ситуаций в конструкторе и отсутствии
    // необходимости ленивой инициализации.
}
