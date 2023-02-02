package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @program: winter-study
 * @description: ArrayList学习
 * @author: Charon
 * @create: 2023-02-02 15:48
 **/
public class ArrayListLearn {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3));
        System.out.println("list = " + list.size());
    }
}
