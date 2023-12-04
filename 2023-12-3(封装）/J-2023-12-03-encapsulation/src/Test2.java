/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-03
 * Time: 20:41
 */
//代码块 静态代码块 只会执行一次 但很快
//       实列（构造） 只有创建对象时才能执行
//       局部代码块
//      同步代码块
//如何访问对象中的成员
//1.普通的成员变量
// 通过点号和对象的引用
//2.静态的成员变量
//通过点号和类名
class A{
       public static void hello(){
           System.out.println("hello");
       }
}
public class Test2 {
    public static String classes;
    {
        System.out.println("实例代码块");//后
    }
    static{
        System.out.println("静态代码块");//先
    }
    public static void main(String[] args) {
         A a=null;
         a.hello();
    }
}
