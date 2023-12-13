/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-10
 * Time: 20:24
 */
//1.接口中不能有静态代码块和构造方法
//2.如果你不想实现接口中的方法，就把这个类定义为抽象类
//接口里的变量默认为 public static final
// 方法默认为  public abstract
 interface USB{
    void openDevice();
    void closeDevice();
}
class Mouse implements USB{
     @Override
    public void openDevice(){
         System.out.println("打开鼠标");
     }
     @Override
    public void closeDevice(){
         System.out.println("关闭鼠标");
     }
     public void click(){
         System.out.println("鼠标点击");
     }
}
class KeyBoard implements USB{
     @Override
    public void openDevice(){
         System.out.println("打开键盘");
     }
    @Override
    public void closeDevice(){
        System.out.println("关闭键盘");
    }
    public void input(){
        System.out.println("键盘输入");
    }
}
 class Computer{
     public void powerOn(){
         System.out.println("打开笔记本电脑");
     }

     public void powerOff(){
         System.out.println("关闭笔记本电脑");
     }
     public void useDevice(USB usb){
         usb.openDevice();
         if(usb instanceof Mouse){
             Mouse mouse = (Mouse) usb;
             mouse.click();
         }
         else if(usb instanceof KeyBoard){
             KeyBoard keyBoard = (KeyBoard) usb;
             keyBoard.input();
         }
         usb.closeDevice();
     }
}
public class Test1 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        computer.useDevice(new KeyBoard());
        computer.useDevice(new Mouse());
        computer.powerOff();
    }
}
