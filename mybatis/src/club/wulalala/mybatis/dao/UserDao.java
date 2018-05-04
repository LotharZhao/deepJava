package club.wulalala.mybatis.dao;

import java.util.List;

import club.wulalala.mybatis.po.User;

/**
 * <p>Title: UserDao</p>
 * <p>Description: dao�ӿڣ��û�����</p>
 * @author zhaoliangtao
 * @date 2018��2��8�� 19��27��
 */
public interface UserDao {

	// ����id��ѯ�û���Ϣ
	public User findUserById(int id) throws Exception;

	// �����û����в�ѯ�û��б�
	public List<User> findUserByName(String name) throws Exception;

	// ����û���Ϣ
	public void insertUser(User user) throws Exception;

	// ɾ���û���Ϣ
	public void deleteUser(int id) throws Exception;
}
