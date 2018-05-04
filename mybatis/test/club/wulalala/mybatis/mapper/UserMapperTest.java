package club.wulalala.mybatis.mapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import club.wulalala.mybatis.mapper.UserMapper;
import club.wulalala.mybatis.po.User;
import club.wulalala.mybatis.po.UserCustom;
import club.wulalala.mybatis.po.UserQueryVo;

public class UserMapperTest {

	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindUserById() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// ����UserMapper����mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.findUserById(1);
		System.out.println(user);
	}
	
	@Test
	public void testFindUserByName() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// ����UserMapper����mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> list = userMapper.findUserByName("С��");
		System.out.println(list);
	}

	// �û���Ϣ���ۺϲ�ѯ
	@Test
	public void testFindUserList() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// ����UserMapper����mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setSex("1");
//		userCustom.setUsername("��");
		userQueryVo.setUserCustom(userCustom);

		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(10);
		userQueryVo.setIds(ids);

		List<UserCustom> list = userMapper.findUserList(userQueryVo);
//		int num = userMapper.findUserCount(null);
		System.out.println(list);
	}

	// ����id��ѯ�û���Ϣ��ʹ��resultMap���
	@Test
	public void findUserByIdResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// ����UserMapper����mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		User user = userMapper.findUserByIdResultMap(1);
		System.out.println(user);
	}
}
