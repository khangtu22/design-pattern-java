package creational.singleton;

public final class Singleton {
    private static Singleton _captain;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (_captain == null) {
            _captain = new Singleton(value);
        }
        return _captain;
    }
}