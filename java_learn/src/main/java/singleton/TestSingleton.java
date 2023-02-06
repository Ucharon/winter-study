package singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: winter-study
 * @description: 测试单例
 * @author: Charon
 * @create: 2023-02-06 15:41
 **/
public class TestSingleton {

    public static void main(String[] args) throws Exception {
        Singleton2.otherMethod();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());

        // 反射破坏单例
        //reflection(Singleton1.class);

        // 反序列化破坏单例
        serializable(Singleton2.getInstance());

        // Unsafe破坏单例
        //unsafe(Singleton1.class);
    }

    private static void unsafe(Class<Singleton1> singleton1Class) {

    }

    private static void serializable(Object instance) throws IOException, ClassNotFoundException {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>反序列化破坏单例>>>>>>>>>>>>>>>>>>>>>");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(instance);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        System.out.println("反序列化创造实例：" + ois.readObject());
    }

    private static void reflection(Class<?> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>反射破坏单例>>>>>>>>>>>>>>>>>>>>>");
        for (Constructor<?> declaredConstructor : clazz.getDeclaredConstructors()) {
            System.out.println("declaredConstructor = " + declaredConstructor);
        }
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        System.out.println("反射创建实例" + constructor.newInstance());
    }


}
