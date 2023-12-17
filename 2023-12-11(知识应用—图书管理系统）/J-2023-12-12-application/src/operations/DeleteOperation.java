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
public class DeleteOperation implements IOperations{
    @Override
    public void work(BookList bookList){
        System.out.println("删除图书");
        System.out.println("请输入要删除的图书：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int index=-1;
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getpos(i);
            if(name.equals(book.getName())){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("没找到该书！");
            return;
        }
        for (int i = index; i <currentSize-1; i++) {
            Book book = bookList.getpos(i+1);
            bookList.setBooks(book,i);
        }
        //删除置空
        bookList.setBooks(null,currentSize-1);
        bookList.setUsedSize(currentSize-1);
    }
}
