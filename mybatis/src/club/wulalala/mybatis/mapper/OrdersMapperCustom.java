package club.wulalala.mybatis.mapper;
import java.util.List;

import club.wulalala.mybatis.po.Orders;
import club.wulalala.mybatis.po.OrdersCustom;
import club.wulalala.mybatis.po.User;

/**
 * <p>Title: OrdersMapperCustom</p>
 * <p>Description: 订单mapper</p>
 * @author zhaoliangtao
 * @date 2018年2月26日 18点58分
 */
public interface OrdersMapperCustom {
	
	// 查询订单关联查询用户信息
	public List<OrdersCustom> findOrdersUser() throws Exception;
	
	// 查询订单关联查询用户使用resultMap
	public List<Orders> findOrdersUserResultMap() throws Exception;

	// 查询订单(关联用户)及订单明细
	public List<Orders>  findOrdersAndOrderDetailResultMap() throws Exception;
	
	// 查询用户购买商品信息
	public List<User>  findUserAndItemsResultMap() throws Exception;
	
	//查询订单关联查询用户，用户信息是延迟加载
	public List<Orders> findOrdersUserLazyLoading() throws Exception;

}

