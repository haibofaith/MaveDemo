package dao;

import model.User;

public interface MemberDao {
    User get(String keyId);
    boolean add(User member);
}
