package inner1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-04
 * Time: 19:59
 */
//实例内部类不能有静态变量
//在实例内部类中获取外部类的this: OuterClass.this.data1
//外部类中任何成员都可以在实例内部类方法中直接访问
//外部类中，不能直接访问实例内部类的成员，需创建一个内部对象
class OuterClass{
    public int data1=1;
    int data2;
    public static int data3;
    public void test(){
        System.out.println("haoaho");
    }
    class InnerClass{
        public int data1=2;
        int data5;
        //public static int data6;//error
        public static final int data6 = 10;
        //final 让 data6 成为常量
        final int SIZE =10;

        public void func(){
            System.out.println("hehe");
            System.out.println(data1);
            System.out.println(this.data1);
            System.out.println(OuterClass.this.data1);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();
    }
}
