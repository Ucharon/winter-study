package singleton;

import java.io.Serializable;

/**
 * @program: winter-study
 * @description: 3. 懒汉式单例
 * @author: Charon
 * @create: 2023-02-06 17:07
 **/
public class Singleton3 implements Serializable {

    private static Singleton3 INSTANCE = null;

    private Singleton3() {
        System.out.println("private Singleton3()");
    }

    // Singleton3.class
    public static synchronized Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }

    public static void otherMethod() {
        System.out.println("otherMethod()");
    }



}
