package dao;


import java.util.List;

import model.BookBean;
import model.StudentBean;
import model.UserInfo;

public interface BookMapper {

    UserInfo selectByUsername(String username);
    
    UserInfo selectByUser(UserInfo user);
    
    void deleteOne(int id);
    //批量删除
    void deleteBatch(List<Integer> ids);
    
    List<BookBean> selectBookBean(BookBean book);
    
    void updateBookListById(BookBean book);
    
    BookBean selectBooklistById(int id);
    
    StudentBean selectStudentBean(StudentBean studentBean);
}