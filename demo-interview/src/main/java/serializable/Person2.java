package serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 模糊化序列化数据（并不是加密）
 *
 * @Author: zhangb
 * @Date: 2017/12/19 15:10
 */
public class Person2 implements Serializable {
    //主要用于保证序列化对象的版本兼容
    private static final long serialVersionUID = -3443501139434664005L;
    private String name;
    private int age;
    private Person2 per;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person2() {
        super();
    }

    //模糊化数据处理：这里采用简单方式
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        age = age << 2;//混淆关键字段
        objectOutputStream.defaultWriteObject();//将当前类的非静态和非瞬态字段写入此流
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        age = age >> 2;//解混淆关键字段 注意解混淆放在objectInputStream.defaultReadObject();后面
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

    public Person2 getPer() {
        return per;
    }

    public void setPer(Person2 per) {
        this.per = per;
    }

}