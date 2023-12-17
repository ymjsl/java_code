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
public class ReturnOperation implements IOperations{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入归还图书的名字：");
        Scanner scanner = new Scanner(System.in);
        String name =scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getpos(i);
            if (name.equals(book.getName())) {
                book.setIfBorrowed(false);
                System.out.println("归还成功");
                return;
            }
        }
        System.out.println("没找到该书");
    }
}
