package dao;


import java.util.List;

import model.UserInfo;

public interface BookMapper {

    UserInfo selectByUsername(String username);
    
    UserInfo selectByUser(UserInfo user);
    
    void deleteOne(int id);
    //批量删除
    void deleteBatch(List<Integer> ids);
}