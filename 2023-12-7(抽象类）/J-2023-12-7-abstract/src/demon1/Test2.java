package demon1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-07
 * Time: 20:28
 */
abstract class Shape{
    public static int a =10;
    public abstract void draw();
    public void func(){

    }
}
class Rect extends Shape{
    @Override
    public void draw(){
        System.out.println("画矩形");
    }
}
public class Test2 {
    public static void main(String[] args) {
        Shape shape = new Rect();
    }
}
