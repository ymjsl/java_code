package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-07
 * Time: 19:44
 */
class Shape{
    public  void draw(){
        System.out.println("画图形");
    }
}
class Rect extends Shape{
    @Override
    public void draw(){
        System.out.println("画矩形");
    }
}
class Cycle extends Shape{
    @Override
    public void draw(){
        System.out.println("画圆");
    }
}
class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("画三角形");
    }
}
public class Test2 {
    public static void drawShapes(){
        Shape[] shapes ={new Rect(), new Cycle(), new Triangle()};
        //向上转型
        for (Shape x:shapes) {
            x.draw();
            //drawMap(x);
        }
    }
    //在drawMap方法中，Shape shape引用 引用的子类对象不一样，调用方法
    //表现出来的行为不一样 这种思想为多态
    public static void drawMap(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        drawMap(new Triangle());
        drawMap(new Cycle());
        drawMap(new Rect());
    }
    public static void main1(String[] args) {
        Shape shape = new Rect();
        shape.draw();
        Shape shape1 = new Cycle();
        shape1.draw();
        Shape shape2 = new Triangle();
        shape2.draw();
    }
}
