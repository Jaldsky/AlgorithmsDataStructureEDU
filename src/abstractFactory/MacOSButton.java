package abstractFactory;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Have created MacOSButton");
    }
}
