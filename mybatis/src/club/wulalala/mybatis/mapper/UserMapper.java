package club.wulalala.mybatis.mapper;

import java.util.List;

import club.wulalala.mybatis.po.User;
import club.wulalala.mybatis.po.UserCustom;
import club.wulalala.mybatis.po.UserQueryVo;

/**
 * <p>Title: UserMapper</p>
 * <p>Description: mapper�ӿڣ��൱ ��dao�ӿڣ��û�����</p>
 * @author zhaoliangtao
 * @date 2018��2��8�� 19��46��
 */
public interface UserMapper {

	// ����id��ѯ�û���Ϣ��ʹ��resultMap���
	public User findUserByIdResultMap(int id) throws Exception;

	// �û���Ϣ�ۺϲ�ѯ
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;

	// ���û�Ϣ�ۺϲ�ѯ����
	public int findUserCount(UserQueryVo userQueryVo) throws Exception;

	// ����id��ѯ�û���Ϣ
	public User findUserById(int id) throws Exception;

	// �����û����в�ѯ�û��б�
	public List<User> findUserByName(String name) throws Exception;

	// ����û���Ϣ
	public void insertUser(User user) throws Exception;

	// ɾ���û���Ϣ
	public void deleteUser(int id) throws Exception;
	
	// �����û���Ϣ
	public void updateUser(User user) throws Exception;
}
