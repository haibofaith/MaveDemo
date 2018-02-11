package dao;

import java.util.List;

import model.User;

public interface IUserDao {
	/**
	 * 新增
	 * <br>------------------------------<br>
	 * @param user
	 */
	void insert(User user);
	
	/**
	 * 新增
	 * <br>------------------------------<br>
	 * @param users
	 */
	void insertAll(List<User> users);
	
	/**
	 * 删除,主键id, 如果主键的值为null,删除会失败
	 * <br>------------------------------<br>
	 * @param id
	 */
	void deleteById(String id);
	
	/**
	 * 按条件删除
	 * <br>------------------------------<br>
	 * @param criteriaUser
	 */
	void delete(User criteriaUser);
	
	/**
	 * 删除全部
	 * <br>------------------------------<br>
	 */
	void deleteAll();
	
	/**
	 * 修改
	 * <br>------------------------------<br>
	 * @param user
	 */
	void updateById(User user);
	
	/**
	 * 更新多条
	 * <br>------------------------------<br>
	 * @param criteriaUser
	 * @param user
	 */
	void update(User criteriaUser, User user);
	
	/**
	 * 根据主键查询
	 * <br>------------------------------<br>
	 * @param id
	 * @return
	 */
	User findById(String id);
	
	/**
	 * 查询全部
	 * <br>------------------------------<br>
	 * @return
	 */
	List<User> findAll();
	
	/**
	 * 按条件查询
	 * <br>------------------------------<br>
	 * @param criteriaUser
	 * @param skip
	 * @param limit
	 * @return
	 */
	List<User> find(User criteriaUser, int skip, int limit);
	
	/**
	 * 根据条件查询出来后 在去修改
	 * <br>------------------------------<br>
	 * @param criteriaUser  查询条件
	 * @param updateUser    修改的值对象
	 * @return
	 */
	User findAndModify(User criteriaUser, User updateUser);
	
	/**
	 * 查询出来后 删除
	 * <br>------------------------------<br>
	 * @param criteriaUser
	 * @return
	 */
	User findAndRemove(User criteriaUser);
	
	/**
	 * count
	 * <br>------------------------------<br>
	 * @param criteriaUser
	 * @return
	 */
	long count(User criteriaUser);
}
