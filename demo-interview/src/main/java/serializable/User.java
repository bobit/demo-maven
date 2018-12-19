package serializable;

import java.io.Serializable;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2017/12/19 14:43
 */
public class User implements Serializable {

    private static final long serialVersionUID = 3082467373049532957L;
    private int id;

    private String name;

    private String sex;

    private int Age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "serializable.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", Age=" + Age +
                '}';
    }
}
