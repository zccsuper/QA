package sh.global.qa.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import sh.global.qa.bean.rework.ReworkBean;
import sh.global.qa.bean.rework.ReworkLogBean;
import sh.global.qa.dao.ReworkDao;

/**
 * dao描述：返工单数据操作
 * @author zcc
 * @date 2014-07-20
 */
public class ReworkDaoImpl extends SqlMapClientDaoSupport implements ReworkDao {

	/**
	 * 方法描述：通过id获取返工单，包括获取返工单日志等信息
	 * @param order_id
	 * @return ReworkBean
	 * @author zcc
	 * @date 2014-07-20
	 */
	@Override
	public ReworkBean getReworkOrderByOrderId(String order_id) {
		
		ReworkBean rework = (ReworkBean) this.getSqlMapClientTemplate().queryForObject("getReworkOrderByOrderId", order_id);
		List<ReworkLogBean> log = this.getReworkLogsByOrderId(order_id);
		rework.setLogo_list(log);
		return rework;
	}

	/**
	 * 方法描述：通过id获取返工单的日志
	 * @param order_id
	 * @return List<ReworkLogoBean>
	 * @author zcc
	 * @date 2014-07-20
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ReworkLogBean> getReworkLogsByOrderId(String order_id) {
		List<ReworkLogBean> list = this.getSqlMapClientTemplate().queryForList("getReworkLogsByOrderId", order_id);
		return list;
	}

}
