package list;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: winter-study
 * @description:
 * @author: Charon
 * @create: 2023-02-02 16:49
 **/
public class TestArrayList {
    // fail-fast 一旦发现遍历的同时其他人来修改，则立刻抛出异常
    // fail-safe 发现遍历的同时其他人修改，应当能有应对策略，例如牺牲一致性让整个遍历完成
    
    public static void main(String[] args) {
        //failFast();
        failSafe();
    }

    /**
     * 模拟fail-fast
     */
    private static void failFast() {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("a"));
        list.add(new Student("b"));
        list.add(new Student("c"));
        list.add(new Student("d"));
        list.add(new Student("e"));
        for (Student student : list) {
            System.out.println("student = " + student);
        }
        System.out.println("list = " + list);
    }

    /**
     * 模拟fail-safe
     */
    private static void failSafe() {
        CopyOnWriteArrayList<Student> list = new CopyOnWriteArrayList<>();

        list.add(new Student("a"));
        list.add(new Student("b"));
        list.add(new Student("c"));
        list.add(new Student("d"));
        list.add(new Student("e"));
        for (Student student : list) {
            System.out.println("student = " + student);
        }
        System.out.println("list = " + list);
    }
}
