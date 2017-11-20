package service;

import java.util.List;

import model.BookBean;
import model.StudentBean;
import model.UserInfo;

public interface UserService {
	UserInfo getUserInfo(String username);
	UserInfo getUserByUser(UserInfo user);
	void delete(int id);
	//批量删除
	void deleteBatch(List<Integer> ids);
	List<BookBean> selectBookBean(BookBean book);
	//更新语句
	void updateBookListById(BookBean book);
	
	BookBean selectBooklistById(int id);
	StudentBean selectStudentBean(StudentBean studentBean);
}
