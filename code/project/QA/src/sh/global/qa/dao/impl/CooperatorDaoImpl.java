package sh.global.qa.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import sh.global.qa.bean.CooperatorBean;
import sh.global.qa.dao.CooperatorDao;

/**
 * dao��������Э�������ݲ���
 * @author zcc
 * @date 2014-07-18
 */
public class CooperatorDaoImpl extends SqlMapClientDaoSupport implements CooperatorDao {

	/**
	 * ������������ȡ������Э����
	 * @param null
	 * @return List<CooperatorBean>
	 * @author zcc
	 * @date 2014-07-18
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CooperatorBean> getAllCooperators() {
		List<CooperatorBean> list = this.getSqlMapClientTemplate().queryForList("getAllCooperators");
		return list;
	}

}
