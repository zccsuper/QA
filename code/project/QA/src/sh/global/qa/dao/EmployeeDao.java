package sh.global.qa.dao;

import sh.global.qa.bean.EmployeeBean;

public interface EmployeeDao {

	/**
	 * �ӿ�����������Ա��id���Ա��ʵ��
	 * @param id
	 * @return EmployeeBean
	 * @author zcc
	 * @date 2014-07-18
	 */
	public EmployeeBean getEmployeeById(String id);
}
