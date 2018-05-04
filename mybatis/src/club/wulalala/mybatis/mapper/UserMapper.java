package club.wulalala.mybatis.mapper;

import java.util.List;

import club.wulalala.mybatis.po.User;
import club.wulalala.mybatis.po.UserCustom;
import club.wulalala.mybatis.po.UserQueryVo;

/**
 * <p>Title: UserMapper</p>
 * <p>Description: mapper接口，相当 于dao接口，用户管理</p>
 * @author zhaoliangtao
 * @date 2018年2月8日 19点46分
 */
public interface UserMapper {

	// 根据id查询用户信息，使用resultMap输出
	public User findUserByIdResultMap(int id) throws Exception;

	// 用户信息综合查询
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;

	// 信用户息综合查询总数
	public int findUserCount(UserQueryVo userQueryVo) throws Exception;

	// 根据id查询用户信息
	public User findUserById(int id) throws Exception;

	// 根据用户名列查询用户列表
	public List<User> findUserByName(String name) throws Exception;

	// 添加用户信息
	public void insertUser(User user) throws Exception;

	// 删除用户信息
	public void deleteUser(int id) throws Exception;
	
	// 更新用户信息
	public void updateUser(User user) throws Exception;
}
