package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.BookMapper;
import model.BookBean;
import model.StudentBean;
import model.UserInfo;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private BookMapper bookDao;
	@Override
	public UserInfo getUserInfo(String username) {
		return bookDao.selectByUsername(username);
	}
	
	@Override
	public UserInfo getUserByUser(UserInfo user) {
		return bookDao.selectByUser(user);
	}

	@Override
	public void delete(int id) {
		bookDao.deleteOne(id);
	}

	@Override
	public void deleteBatch(List<Integer> ids) {
		bookDao.deleteBatch(ids);
	}

	@Override
	public List<BookBean> selectBookBean(BookBean book) {
		return bookDao.selectBookBean(book);
	}

	@Override
	public void updateBookListById(BookBean book) {
		// TODO Auto-generated method stub
		bookDao.updateBookListById(book);
	}

	@Override
	public BookBean selectBooklistById(int id) {
		// TODO Auto-generated method stub
		return bookDao.selectBooklistById(id);
	}

	@Override
	public StudentBean selectStudentBean(StudentBean studentBean) {
		// TODO Auto-generated method stub
		return bookDao.selectStudentBean(studentBean);
	}
	
}
