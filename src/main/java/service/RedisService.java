package service;

import model.User;

public interface RedisService {
	User get(String keyId);
    boolean add(User member);
}
