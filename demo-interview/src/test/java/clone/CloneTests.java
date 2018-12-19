package clone;

import org.junit.Test;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2018/12/19 14:07
 */
public class CloneTests {

    @Test
    public void test() {
        Student student1 = new Student("zhangsan", 18);
        Student student2 = (Student) student1.clone();
        student2.name = "lisi";
        student2.age = 20;
        //修改学生2后，不影响学生1的值。
        System.out.println("name=" + student1.name + "," + "age=" + student1.age);
    }
}
