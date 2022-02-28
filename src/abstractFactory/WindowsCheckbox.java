package abstractFactory;

public class WindowsCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Have created WindowsCheckbox");
    }
}
