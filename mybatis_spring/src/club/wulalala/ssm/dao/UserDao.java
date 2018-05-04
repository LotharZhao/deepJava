package club.wulalala.ssm.dao;

import club.wulalala.ssm.po.User;

/**
 * 
 * <p>Title: UserDao</p>
 * <p>Description: dao接口，用户管理</p>
 * @author zhaoliangtao
 * @date 2018年3月3日 16点27分
 */
public interface UserDao {
	
	//根据id查询用户信息
	public User findUserById(int id) throws Exception;

}
