package singleton;

public enum Singleton2 {

    INSTANCE;

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    private Singleton2() {
        System.out.println("private Singleton2()");
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    public static void otherMethod() {
        System.out.println("otherMethod()");
    }
}
