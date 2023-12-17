package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-12
 * Time: 19:45
 */
public class FindOperation implements IOperations{
    @Override
    public void work(BookList bookList){
        System.out.println("请输入书名:");
        Scanner scanner = new Scanner(System.in);
        String name =scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < bookList.usedSize; i++) {
            Book book = bookList.getpos(i);
            if(name.equals(book.getName())){
                System.out.println("找到了");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有这本书");
    }

}
