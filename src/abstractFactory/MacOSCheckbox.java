package abstractFactory;

public class MacOSCheckbox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Have created MacOSCheckbox");
    }
}
