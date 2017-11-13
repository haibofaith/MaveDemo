package service;

import java.util.List;

import model.UserInfo;

public interface UserService {
	UserInfo getUserInfo(String username);
	UserInfo getUserByUser(UserInfo user);
	void delete(int id);
	//批量删除
	void deleteBatch(List<Integer> ids);
}
