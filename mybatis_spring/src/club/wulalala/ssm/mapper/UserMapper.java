package club.wulalala.ssm.mapper;

import club.wulalala.ssm.po.User;

/**
 * 
 * <p>Title: UserMapper</p>
 * <p>Description: mapper接口，相当 于dao接口，用户管理</p>
 * @author zhaoliangtao
 * @date 2018年3月3日 16点27分
 */
public interface UserMapper {
	
	//根据id查询用户信息
	public User findUserById(int id) throws Exception;
}
