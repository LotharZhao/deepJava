package club.wulalala.mybatis.first;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import club.wulalala.mybatis.po.User;

/**
 * 
 * <p>Title: MybatisFirst</p>
 * <p>Description: ���ų���</p>
 * @author zhaoliangtao
 * @date 2018��2��8�� 10��13��
 */
public class MybatisFirst {

	// ����id��ѯ�û���Ϣ���õ�һ����¼���
	@Test
	public void findUserByIdTest() throws IOException {
		// mybatis�����ļ�
		String resource = "SqlMapConfig.xml";
		// �õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// �����Ự����������mybatis�������ļ���Ϣ
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// ͨ��SqlSession�������ݿ�
		// ��һ��������ӳ���ļ���statement��id������=namespace+"."+statement��id
		// �ڶ���������ָ����ӳ���ļ�����ƥ���parameterType���͵Ĳ���
		// sqlSession.selectOne��� ����ӳ���ļ�����ƥ���resultType���͵Ķ���
		// selectOne��ѯ��һ����¼
		User user = sqlSession.selectOne("test.findUserById", 1);
		System.out.println(user);
		// �ͷ���Դ
		sqlSession.close();
	}

	// �����û�����ģ����ѯ�û��б�
	@Test
	public void findUserByNameTest() throws IOException {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// list�е�user��ӳ���ļ���resultType��ָ��������һ��
		List<User> list = sqlSession.selectList("test.findUserByName", "С��");
		System.out.println(list);
		sqlSession.close();
	}

	// ����û���Ϣ
	@Test
	public void insertUserTest() throws IOException {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// �����û�����
		User user = new User();
		user.setUsername("��С��");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("����֣��");
		sqlSession.insert("test.insertUser", user);
		// �ύ����
		sqlSession.commit();
		// ��ȡ�û���Ϣ����
		System.out.println(user.getId());
		// �رջỰ
		sqlSession.close();
	}

	// ����idɾ�� �û���Ϣ
	@Test
	public void deleteUserTest() throws IOException {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// ����idɾ�� �û�
		sqlSession.delete("test.deleteUser", 27);

		sqlSession.commit();
		sqlSession.close();
	}

	// �����û���Ϣ
	@Test
	public void updateUserTest() throws IOException {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// �����û���Ϣ
		User user = new User();
		//��������id
		user.setId(29);
		user.setUsername("�����");
		user.setBirthday(new Date());
		user.setSex("2");
		user.setAddress("����֣��");
		sqlSession.update("test.updateUser", user);

		sqlSession.commit();
		sqlSession.close();
	}
}
