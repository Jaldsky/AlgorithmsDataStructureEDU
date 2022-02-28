package factoryMethod;

public class HtmlButton implements Button { //конкретный класс кнопки
    public void render() { //имплементация интерфейса
        System.out.println("<button>Test button</button>");
        onClick();
    }

    public void onClick() { //имплементация интерфейса
        System.out.println("Clicked button");
    }
}
