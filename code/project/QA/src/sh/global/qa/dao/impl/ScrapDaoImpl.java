package sh.global.qa.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import sh.global.qa.bean.ScrapBean;
import sh.global.qa.dao.ScrapDao;

/**
 * dao���������ϵ����ݲ���
 * @author zcc
 * @date 2014-07-18
 */
public class ScrapDaoImpl extends SqlMapClientDaoSupport implements ScrapDao {

	/**
	 * ����������ͨ��id��ȡ���ϵ�
	 * @param order_id
	 * @return ScrapBean
	 * @author zcc
	 * @date 2014-07-18
	 */
	@Override
	public ScrapBean getScrapByOrderId(String order_id) {
		ScrapBean scrap = (ScrapBean) this.getSqlMapClientTemplate().queryForObject("getScrapByOrderId", order_id);
		return scrap;
	}

}
