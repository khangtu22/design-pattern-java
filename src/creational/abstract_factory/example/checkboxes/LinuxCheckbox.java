package creational.abstract_factory.example.checkboxes;

public class LinuxCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created LinuxCheckbox.");
    }
}
