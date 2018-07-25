package cn.learn.ioc;

public class UserService {
	//1定义dao类型的属性
	private UserDao userDao;
	//2 生成set方法
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add(){
		System.out.println("service........");
		userDao.add();
	}
}
