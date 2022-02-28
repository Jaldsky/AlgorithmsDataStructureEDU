package factoryMethod;

public class Main {
    private static Dialog dialog; //статическая переменная диалога

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog(); //создание диалога окна
        } else {
            dialog = new HtmlDialog(); //создание диалога html
        }
    }

    static void runBusinessLogic() { //отрисовка
        dialog.renderWindow();
    }
}
