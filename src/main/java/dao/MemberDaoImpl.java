package dao;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Repository;

import model.User;

@Repository(value = "memberDao2")
public class MemberDaoImpl extends RedisGeneratorDao implements MemberDao {

	@Override
	public User get(String keyId) {
		// TODO Auto-generated method stub
		ValueOperations<String, String> stringOperations = redisTemplate.opsForValue();
		String name = stringOperations.get(keyId);
		if (name != null) {
			return new User(keyId, name, 0);
		} else {
			return null;
		}
	}

	@Override
	public boolean add(User member) {
		// TODO Auto-generated method stub
		ValueOperations<String, String> stringOperations = redisTemplate.opsForValue();
		stringOperations.set(member.getId(), member.getName());
		System.out.println("member.getId():" + member.getId());
		return true;
	}

}
