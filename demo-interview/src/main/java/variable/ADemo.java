package variable;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/3/7 12:04
 */
public class ADemo {

    public static void main(String[] args) {
        BB b = new BB();
    }
}

class AA {
    AA() {
        test();
    }

    void test() {
        System.out.println("hello");
    }
}

class BB extends AA {
    int i = 11;

    BB() {

    }

    void test() {
        System.out.println("world");
        System.out.println(i);
    }
}