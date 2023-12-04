import java.util.Arrays;
import java.util.Date;
import java.sql.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-03
 * Time: 19:12
 */
//封装 将数据和操作数据的方法进行有机结合，隐藏对象的属性和实现细节
//仅对外公开接口来和对象进行交互
//访问修饰限定符
//  private     default   protected   public
//  私有的        默认的                 公开的
//只能在当前类的内部访问
//同一包同一类
//同一包不同类
//不同包中的子类
//不同包中的非子类
//package 包/文件夹
//自定义包
//在文件上方加上一个package 语句 指定 该代码在哪个包
//包名需尽量指定成唯一的名字，通常会用公司的域名的颠倒形式
//包名要和代码路径相匹配
//如果一个类没有package ,则该类放在默认包
//可以使用import static 导入包中静态的方法和字段
class Person{
        private String name;
        public int age;
        String sex;//默认是default权限: 默认权限
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
            System.out.println("姓名:"+name+"年龄:"+age);
        }
}
public class Test {
    public static void main(String[] args) {
        java.util.Date date =new java.util.Date();
        System.out.println(date.getTime());
        /*int[] array={1,2,3,4};
        Arrays.toString(array);*/
    }
    public static void main1(String[] args) {
         Person person = new Person();
         person.age=18;
         //person.name="杨俊峰";
         person.show();
         int age=person.getAge();
        System.out.println(age);
    }
}
