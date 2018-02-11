package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.IUserDao;
import dao.impl.UserDao;
import model.User;
@Service
public class MongoServiceImpl implements MongoService{
	@Resource
	private UserDao iUserDao;
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		iUserDao.insert(user);
	}

	@Override
	public void insertAll(List<User> users) {
		// TODO Auto-generated method stub
		iUserDao.insertAll(users);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		iUserDao.deleteById(id);
	}

	@Override
	public void delete(User criteriaUser) {
		// TODO Auto-generated method stub
		iUserDao.delete(criteriaUser);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		iUserDao.deleteAll();
	}

	@Override
	public void updateById(User user) {
		// TODO Auto-generated method stub
		iUserDao.updateById(user);
	}

	@Override
	public void update(User criteriaUser, User user) {
		// TODO Auto-generated method stub
		iUserDao.update(criteriaUser,user);
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return iUserDao.findById(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return iUserDao.findAll();
	}

	@Override
	public List<User> find(User criteriaUser, int skip, int limit) {
		// TODO Auto-generated method stub
		return iUserDao.find(criteriaUser,skip,limit);
	}

	@Override
	public User findAndModify(User criteriaUser, User updateUser) {
		// TODO Auto-generated method stub
		return iUserDao.findAndModify(criteriaUser, updateUser);
	}

	@Override
	public User findAndRemove(User criteriaUser) {
		// TODO Auto-generated method stub
		return iUserDao.findAndRemove(criteriaUser);
	}

	@Override
	public long count(User criteriaUser) {
		// TODO Auto-generated method stub
		return iUserDao.count(criteriaUser);
	}

}
