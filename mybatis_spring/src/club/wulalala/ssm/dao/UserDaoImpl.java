package club.wulalala.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import club.wulalala.ssm.po.User;

/**
 * <p>Title: UserDaoImpl</p>
 * <p>Description:dao接口实现类</p>
 * @author zhaoliangtao
 * @date 2018年3月3日 16点27分
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		//继承SqlSessionDaoSupport，通过this.getSqlSession()得到sqlSessoin
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById", id);
		return user;
	}

}
