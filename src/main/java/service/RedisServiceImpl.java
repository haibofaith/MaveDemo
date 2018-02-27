package service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.MemberDao;
import model.User;
@Service
public class RedisServiceImpl implements RedisService {
	
	@Resource(name="memberDao2")
	MemberDao memberDao;
	
	@Override
	public User get(String keyId) {
		// TODO Auto-generated method stub
		return memberDao.get(keyId);
	}

	@Override
	public boolean add(User member) {
		// TODO Auto-generated method stub
		return memberDao.add(member);
	}

}
