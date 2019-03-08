package variable;

/**
 * Java三大变量的特性
 *
 * @Author: zhangb
 * @Date: 2019/3/7 13:38
 */
public class VariableType {
    //定义类变量
    public static String name = "zhangsan";
    //定义实例变量
    public char sex = 'M';

    /**
     * 方法描述：输出对中国祝福的内容
     * 输入参数：String str
     * 返回类型：void
     */
    public String print(String str) { //定义局部变量
        String str1 = "中国，";
        return str1 + str;
    }

    /**
     * 方法描述:主方法
     * 输入参数:String[] args
     * 返回类型:void
     */

    public static void main(String[] args) {
        System.out.println("类变量");
        System.out.println("名字：" + VariableType.name);

        VariableType type = new VariableType();
        System.out.println("实例变量");
        System.out.println("性别：" + type.sex);
        System.out.println("局部变量");
        System.out.println("祝福：" + type.print("我爱你！"));
    }
}
