package operations;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-12
 * Time: 19:51
 */
public class ExitOperation implements IOperations{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(0);//退出专用
    }
}
