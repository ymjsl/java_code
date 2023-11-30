/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-11-30
 * Time: 18:56
 */
//int ->0
//float->0.0f
//boolean false
//char '\u0000'
class Dog{
    public String name;//默认为null
    public int age;//默认为0
    public void eat(){
        System.out.println(name+"吃");
    }
}
public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
    }
}
