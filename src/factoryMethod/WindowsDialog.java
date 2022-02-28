package factoryMethod;

public class WindowsDialog extends Dialog{ //Еще один диалог

    @Override
    public Button createButton() { //переопределение
        return new WindowButton();
    }
}
