package club.wulalala.mybatis.mapper;
import java.util.List;

import club.wulalala.mybatis.po.Orders;
import club.wulalala.mybatis.po.OrdersCustom;
import club.wulalala.mybatis.po.User;

/**
 * <p>Title: OrdersMapperCustom</p>
 * <p>Description: ����mapper</p>
 * @author zhaoliangtao
 * @date 2018��2��26�� 18��58��
 */
public interface OrdersMapperCustom {
	
	// ��ѯ����������ѯ�û���Ϣ
	public List<OrdersCustom> findOrdersUser() throws Exception;
	
	// ��ѯ����������ѯ�û�ʹ��resultMap
	public List<Orders> findOrdersUserResultMap() throws Exception;

	// ��ѯ����(�����û�)��������ϸ
	public List<Orders>  findOrdersAndOrderDetailResultMap() throws Exception;
	
	// ��ѯ�û�������Ʒ��Ϣ
	public List<User>  findUserAndItemsResultMap() throws Exception;
	
	//��ѯ����������ѯ�û����û���Ϣ���ӳټ���
	public List<Orders> findOrdersUserLazyLoading() throws Exception;

}

