package sh.global.qa.dao;

import java.util.List;

import sh.global.qa.bean.CooperatorBean;

public interface CooperatorDao {

	/**
	 * �ӿ���������ȡ������Э����
	 * @param null
	 * @return List<CooperatorBean>
	 * @author zcc
	 * @date 2014-07-18
	 */
	public List<CooperatorBean> getAllCooperators();
	
}
