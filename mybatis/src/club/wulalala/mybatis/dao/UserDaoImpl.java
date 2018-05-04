package club.wulalala.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import club.wulalala.mybatis.po.User;
/**
 * 
 * <p>Title: UserDaoImpl</p>
 * <p> Description:dao�ӿ�ʵ����</p>
 * @author zhaoliangtao
 * @date 2018��2��8�� 19��31��
 */
public class UserDaoImpl implements UserDao {

	// ��Ҫ��daoʵ������ע��SqlSessionFactory
	// ����ͨ�����췽��ע��
	private SqlSessionFactory sqlSessionFactory;

	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public User findUserById(int id) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = sqlSession.selectOne("test.findUserById", id);
		// �ͷ���Դ
		sqlSession.close();
		return user;
	}

	@Override
	public List<User> findUserByName(String name) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> list = sqlSession.selectList("test.findUserByName", name);
		sqlSession.close();
		return list;
	}

	@Override
	public void insertUser(User user) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// ִ�в������
		sqlSession.insert("test.insertUser", user);
		// �ύ����
		sqlSession.commit();
		// �ͷ���Դ
		sqlSession.close();
	}

	@Override
	public void deleteUser(int id) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//ִ�в������
		sqlSession.delete("test.deleteUser", id);
		// �ύ����
		sqlSession.commit();
		// �ͷ���Դ
		sqlSession.close();
	}
}
