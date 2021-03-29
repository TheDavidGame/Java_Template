package ex5;

public class Singleton3 {
    private static volatile Singleton3 instance;
    public String value;

    private Singleton3(String value) {
        this.value = value;
    }

    public static Singleton3 getInstance(String value) {
        Singleton3 result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton3.class) {
            if (instance == null) {
                instance = new Singleton3(value);
            }
            return instance;
        }
    }
}
