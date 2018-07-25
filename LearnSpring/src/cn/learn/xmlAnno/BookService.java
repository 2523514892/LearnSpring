package cn.learn.xmlAnno;

import javax.annotation.Resource;

public class BookService {
	
	@Resource(name="bookDao")
	private BookDao book1;
	
	@Resource(name="orderDao")
	private OrderDao order;
	
	public void service(){
		System.out.println("service>>>>>>>>>");
		book1.bookDao();
		order.orderDao();
	}
}
