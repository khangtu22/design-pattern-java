package creational.singleton;

public final class Singleton {
    private static Singleton _captain;
    public String value;

    // make the constructor private to prevent user use "new" to create objects
    private Singleton(String value) {
        this.value = value;
    }

    /*
    singleton try to provide a global access point to that instant.

    This static method is static. It act as constructor. This method call private constructor and create
    an object and save in a static field if trying to call this method it will return the same object in
    cached memory.
     */
    public static Singleton getInstance(String value) {
        if (_captain == null) {
            _captain = new Singleton(value);
        }
        return _captain;
    }
}