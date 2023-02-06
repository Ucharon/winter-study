package singleton;

/**
 * @program: winter-study
 * @description: 5. 懒汉式单例-内部类
 * @author: Charon
 * @create: 2023-02-06 19:13
 **/
public class Singleton5 {

    private Singleton5() {
        System.out.println("private Singleton5()");
    }

    private static class Holder {
        static Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return Holder.INSTANCE;
    }

    public static void otherMethod() {
        System.out.println("otherMethod()");
    }
}
