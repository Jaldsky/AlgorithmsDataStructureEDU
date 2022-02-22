package singleton;

public class ClassicSingleton {
    private static ClassicSingleton insance;//пример любого типа данных

    private ClassicSingleton(){}

    public static ClassicSingleton getInsance(){
        if (insance == null) {
            insance = new ClassicSingleton();
        }
        return insance;
    } //У этого решения есть единственный недостаток – оно
    // не работает в многопоточной среде и поэтому не подходит
    // в большинстве случаев. Решение подходит исключительно
    // для однопоточных приложений.
}
