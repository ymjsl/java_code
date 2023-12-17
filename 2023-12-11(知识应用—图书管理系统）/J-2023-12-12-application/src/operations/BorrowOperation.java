package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-12
 * Time: 19:52
 */
public class BorrowOperation implements IOperations{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你要借阅的图书");
        Scanner scanner = new Scanner(System.in);
        String name =scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getpos(i);
            if (name.equals(book.getName())) {
                if(book.isIfBorrowed()){
                    System.out.println("该书已被借出");
                }
                else{
                    book.setIfBorrowed(true);
                    System.out.println("借阅成功");
                }
                return;
            }
        }
        System.out.println("没找到该书");
    }
}
