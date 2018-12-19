package serializable;

import java.io.Serializable;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2017/12/19 15:10
 */
public class Person implements Serializable {
    //主要用于保证序列化对象的版本兼容
    private static final long serialVersionUID = -8146973185149904486L;
    private String name;
    private int age;
    private Person per;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", per=" + (per != null ? per.getName() : "[null]") + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPer() {
        return per;
    }

    public void setPer(Person per) {
        this.per = per;
    }

}