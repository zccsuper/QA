package sh.global.qa.dao;

import sh.global.qa.bean.ScrapBean;

public interface ScrapDao {

	/**
	 * �ӿ�������ͨ��id��ȡ���ϵ�
	 * @param order_id
	 * @return ScrapBean
	 * @author zcc
	 * @date 2014-07-18
	 */
	public ScrapBean getScrapByOrderId(String order_id);
}
