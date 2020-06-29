package creational.abstract_factory.example;

import creational.abstract_factory.example.app.Application;
import creational.abstract_factory.example.factories.GUIFactory;
import creational.abstract_factory.example.factories.LinuxFactory;
import creational.abstract_factory.example.factories.MacOSFactory;
import creational.abstract_factory.example.factories.WindowsFactory;

/**
 * EN: Demo class. Everything comes together here.
 *
 * RU: Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    /**
     * EN: Application picks the factory type and creates it in run time
     * (usually at initialization stage), depending on the configuration or
     * environment variables.
     *
     * RU: Приложение выбирает тип и создаёт конкретные фабрики динамически
     * исходя из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else if (osName.contains("win")){
            factory = new WindowsFactory();
            app = new Application(factory);
        } else {
            factory = new LinuxFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
