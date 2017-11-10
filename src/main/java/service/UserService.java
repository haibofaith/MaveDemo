package service;

import model.UserInfo;

public interface UserService {
	UserInfo getUserInfo(String username);
	UserInfo getUserByUser(UserInfo user);
}
