package sh.global.qa.dao;

import java.util.List;

import sh.global.qa.bean.rework.ReworkBean;
import sh.global.qa.bean.rework.ReworkLogBean;

public interface ReworkDao {

	/**
	 * 接口描述：通过id获取返工单，包括获取返工单日志等信息
	 * @param order_id
	 * @return ReworkBean
	 * @author zcc
	 * @date 2014-07-20
	 */
	public ReworkBean getReworkOrderByOrderId(String order_id);
	
	/**
	 * 接口描述：通过id获取返工单的日志
	 * @param order_id
	 * @return List<ReworkLogBean>
	 * @author zcc
	 * @date 2014-07-20
	 */
	public List<ReworkLogBean> getReworkLogsByOrderId(String order_id);
}
