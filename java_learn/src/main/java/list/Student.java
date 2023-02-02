package list;

/**
 * @program: winter-study
 * @description:
 * @author: Charon
 * @create: 2023-02-02 16:50
 **/
public class Student {

    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
