package club.wulalala.mybatis.dao;

import java.util.List;

import club.wulalala.mybatis.po.User;

/**
 * <p>Title: UserDao</p>
 * <p>Description: dao接口，用户管理</p>
 * @author zhaoliangtao
 * @date 2018年2月8日 19点27分
 */
public interface UserDao {

	// 根据id查询用户信息
	public User findUserById(int id) throws Exception;

	// 根据用户名列查询用户列表
	public List<User> findUserByName(String name) throws Exception;

	// 添加用户信息
	public void insertUser(User user) throws Exception;

	// 删除用户信息
	public void deleteUser(int id) throws Exception;
}
