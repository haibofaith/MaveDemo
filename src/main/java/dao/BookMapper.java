package dao;

import model.UserInfo;

public interface BookMapper {

    UserInfo selectByUsername(String username);
    
    UserInfo selectByUser(UserInfo user);

}