import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-12
 * Time: 19:13
 */
public class Main {
    //利用向上转型
    public static User login(){
        System.out.println("请输入你的姓名:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("请输入你的身份: 1—》管理员，0-》用户");
        int choice = scanner.nextInt();
        if(choice==1){
            return new AdminUser(userName);
        }
        else {
            return new NormalUser(userName);
        }
    }
    public static void main(String[] args) {
        //准备数据
        BookList bookList = new BookList();
        //登录
        User user =login();//向上转型
        while(true){
            int choice= user.menu();//引用谁就是调用谁的菜单
            user.doOperation(choice,bookList);//多态绑定
        }
    }
}
