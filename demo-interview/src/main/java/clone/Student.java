package clone;

/**
 * 继承自java.lang.Object类的clone()方法是浅复制。
 *
 * @Author: zhangb
 * @Date: 2018/12/19 13:43
 */
public class Student implements Cloneable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() {
        Object o = null;
        try {
            o = (Student) super.clone();//Object 中的clone()识别出你要复制的是哪一个对象。
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }

}