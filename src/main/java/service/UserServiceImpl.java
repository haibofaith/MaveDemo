package service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.BookMapper;
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
}
