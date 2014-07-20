package sh.global.qa.dao;

import java.util.List;

import sh.global.qa.bean.CooperatorBean;

public interface CooperatorDao {

	/**
	 * 接口描述：获取所有外协厂家
	 * @param null
	 * @return List<CooperatorBean>
	 * @author zcc
	 * @date 2014-07-18
	 */
	public List<CooperatorBean> getAllCooperators();
	
}
