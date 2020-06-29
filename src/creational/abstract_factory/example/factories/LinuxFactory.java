package creational.abstract_factory.example.factories;

import creational.abstract_factory.example.buttons.Button;
import creational.abstract_factory.example.buttons.LinuxButton;
import creational.abstract_factory.example.checkboxes.Checkbox;
import creational.abstract_factory.example.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
