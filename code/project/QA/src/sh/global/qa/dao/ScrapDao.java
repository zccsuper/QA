package sh.global.qa.dao;

import sh.global.qa.bean.ScrapBean;

public interface ScrapDao {

	/**
	 * 接口描述：通过id获取报废单
	 * @param order_id
	 * @return ScrapBean
	 * @author zcc
	 * @date 2014-07-18
	 */
	public ScrapBean getScrapByOrderId(String order_id);
}
