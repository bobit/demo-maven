package serializable;

import org.junit.Test;

import java.io.*;

/**
 * 序列化与反序列化
 *
 * @Author: zhangb
 * @Date: 2017/12/19 15:15
 */
public class SerializableTests {
    /**
     * 将对象序列化到磁盘文件中
     *
     * @paramo
     * @throwsException
     */
    @Test
    public void writeObjectUser() throws Exception {
        // 将对象序列化
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setSex("男");
        user.setAge(30);

        File f = new File("d:", "user.tmp");
        if (f.exists()) {
            f.delete();
        }
        FileOutputStream os = new FileOutputStream(f);
        //ObjectOutputStream 核心类
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(user);
        oos.close();
        os.close();

    }


    /**
     * 反序列化,将磁盘文件转化为对象
     *
     * @return
     * @paramf
     * @throwsException
     */
    @Test
    public void readObjectUser() throws Exception {
        File f = new File("d:", "user.tmp");

        InputStream is = new FileInputStream(f);
        //ObjectOutputStream 核心类
        ObjectInputStream ois = new ObjectInputStream(is);
        User user = (User) ois.readObject();
        ois.close();
        System.out.println(user);
        f.delete();
    }

    @Test
    public void serializePerson() {
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("李四", 28);
        p1.setPer(p2);
        p2.setPer(p1);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("person.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(p1);
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deserializePerson() {
        try {
            FileInputStream fileInputStream = new FileInputStream("person.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person person = (Person) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(person.toString());
            new File("person.ser").delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
