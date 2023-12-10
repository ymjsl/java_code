package inner1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-04
 * Time: 20:35
 */
//静态内部类中，不能访问外部类的非静态成员，需要外部对象的引用
class OuterClass2{
    public int data1=1;
    int data2=2;
    public static int data3=3;
    public void test(){
        System.out.println("haha");
    }
    static class InnerClass2{
        public int data4 =4;
        int data5 =5;
        public static int data6=6;
        public void func(){
            OuterClass2 outerClass = new OuterClass2();
            System.out.println(outerClass.data1);
            System.out.println(data3);
            System.out.println("hehe");
            //System.out.println(data1);error
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        new OuterClass2();//匿名
        System.out.println(new OuterClass2().data1);
        //匿名对象只能使用一次
    }

    public  void func2(){
        //局部内部类
        class Inner{
            public void test(){
                System.out.println("局限");
            }
        }
        Inner inner = new Inner();
        inner.test();
    }
    public static void main1(String[] args) {
        OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
        Test2 test2 = new Test2();
        test2.func2();
    }
}
