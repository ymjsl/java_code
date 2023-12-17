package user;

import operations.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-12
 * Time: 19:25
 */
public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.iOperations = new IOperations[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DeleteOperation(),
                new DisplayOperation()
        };
    }
    public int menu(){
        System.out.println("***********************************");
        System.out.println("hello"+name+"欢迎来到图书库！");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("**********************************");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
