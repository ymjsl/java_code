package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-12
 * Time: 19:44
 */
public class AddOperation implements IOperations{
    @Override
    public void work(BookList bookList){
        System.out.println("请输入图书的名字");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入作者：");
        String author = scanner.nextLine();
        System.out.println("请输入价格");
        int price = scanner.nextInt();
        scanner.nextLine();//读取回车
        System.out.println("请输入类型");
        String type = scanner.nextLine();
        Book book = new Book(name,author,price,type);
        int currentSize= bookList.getUsedSize();
        bookList.setBooks(book,currentSize);
        System.out.println("您加的书如下：");
        bookList.getBooks(book,currentSize);
        bookList.setUsedSize(currentSize+1);
    }
}
