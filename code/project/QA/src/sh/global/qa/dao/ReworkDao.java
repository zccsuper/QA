package sh.global.qa.dao;

import java.util.List;

import sh.global.qa.bean.rework.ReworkBean;
import sh.global.qa.bean.rework.ReworkLogBean;

public interface ReworkDao {

	/**
	 * �ӿ�������ͨ��id��ȡ��������������ȡ��������־����Ϣ
	 * @param order_id
	 * @return ReworkBean
	 * @author zcc
	 * @date 2014-07-20
	 */
	public ReworkBean getReworkOrderByOrderId(String order_id);
	
	/**
	 * �ӿ�������ͨ��id��ȡ����������־
	 * @param order_id
	 * @return List<ReworkLogBean>
	 * @author zcc
	 * @date 2014-07-20
	 */
	public List<ReworkLogBean> getReworkLogsByOrderId(String order_id);
}
