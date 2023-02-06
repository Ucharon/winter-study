package singleton;

import java.io.Serializable;

/**
 * @program: winter-study
 * @description: 1. 饿汉式 -- 类只要初始化了，就会创造唯一实例（区别与懒汉式）
 * @author: Charon
 * @create: 2023-02-06 15:32
 **/
public class Singleton1 implements Serializable {

    /**
     * 构造方法必须是私有
     */
    private Singleton1() {
        // 应对反射情况
        if (INSTANCE != null) {
            throw new RuntimeException("单例对象不能重复创建");
        }
        System.out.println("private Singleton1()");
    }

    // 定义静态成员变量，创建唯一实例
    private final static Singleton1 INSTANCE = new Singleton1();

    /**
     * 定义一个静态方法，来获得唯一实例
     *
     * @return 唯一实例
     */
    public static Singleton1 getInstance() {
        return INSTANCE;
    }

    /**
     * 定义一个静态方法，来初始化类
     */
    public static void otherMethod() {
        System.out.println("otherMethod()");
    }

    /**
     * 应对反序列化情况
     * @return
     */
    public Object readResolve() {
        return INSTANCE;
    }
}
