package singleton;

/**
 * @program: winter-study
 * @description: 4. DCL懒汉式
 * @author: Charon
 * @create: 2023-02-06 18:43
 **/
public class Singleton4 {

    private static volatile Singleton4 INSTANCE = null; //可见性，有序性

    private Singleton4() {
        System.out.println("private Singleton3()");
    }

    // Singleton3.class
    public static Singleton4 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton4.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton4();
                }
            }
        }
        return INSTANCE;
    }

    public static void otherMethod() {
        System.out.println("otherMethod()");
    }


}
