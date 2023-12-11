package inherit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-05
 * Time: 19:36
 */
class Base{
    int a;
    int b;
}

public class Test2 extends Base{
    int c;
    int a;//优先自己

    public void method(){
        super.a=10;
        b=20;
        c=30;
        System.out.println(super.a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main1(String[] args) {
        Test2 test2 = new Test2();
        test2.method();
    }
}
