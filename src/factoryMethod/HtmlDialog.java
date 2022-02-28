package factoryMethod;

public class HtmlDialog extends Dialog{ //Конкретный диалог

    @Override
    public Button createButton() { //переопределение
        return new HtmlButton();
    }
}
