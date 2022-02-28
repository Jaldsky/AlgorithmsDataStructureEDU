package factoryMethod;

public abstract class Dialog { //базовый диалог(абстрактный класс)

    public void renderWindow() { //рендер кнопки
        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton(); //абстрактный метод, будет переопределяться
}
