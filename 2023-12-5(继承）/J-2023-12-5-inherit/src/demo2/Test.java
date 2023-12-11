package demo2;

import demon1.Test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-06
 * Time: 19:21
 */
public class Test extends Test1 {
    public void test(){
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }
}
