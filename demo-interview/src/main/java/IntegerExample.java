import java.lang.reflect.Field;

/**
 * 实现交换
 * 基本类型、引用类型
 * 反射
 * Integer缓存 -128 127
 * 装箱
 *
 * javap是 Java class文件分解器,可以反编译(即对javac编译的文件进行反编译),也可以查看java编译器生成的字节码。
 * javap -c IntegerExample.class
 *
 * @Author: bobit
 * @Date: 2018/12/3 16:16
 */
public class IntegerExample {
    public static void main(String args[]) throws NoSuchFieldException, IllegalAccessException {
        Integer a = 1, b = 2; //装箱 Integer a = Integer.valueOf(1)
        System.out.println ("before:a=" + a + ",b=" + b);
        //todo
        //swag(a,b);//
        swag1(a,b);
        System.out.println ("before:a=" + a + ",b=" + b);
    }


    public static void swag1(Integer a, Integer b) throws NoSuchFieldException, IllegalAccessException {
        Field field = Integer.class.getDeclaredField("value");
        //当isAccessible()的结果是false时不允许通过反射访问该字段
        //绕过安全检查
        field.setAccessible(true);

        //因缓存导致a变，b未变
        //int tmp = a.intValue();
        Integer tmp = new Integer(a.intValue());

        field.set(a,b.intValue());//装箱 i1 -> Integer.valueOf(b.intValue).intValue()
        field.set(b,tmp);         //Integer.valueOf(tmp).intValue()
        System.out.print(tmp);
    }

    private static void swag(Integer a, Integer b) {
        Integer tmp = a;
        a = b ;
        b = tmp;
    }

}
