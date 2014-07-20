package sh.global.qa.dao;

import sh.global.qa.bean.EmployeeBean;

public interface EmployeeDao {

	/**
	 * 接口描述：根据员工id获得员工实体
	 * @param id
	 * @return EmployeeBean
	 * @author zcc
	 * @date 2014-07-18
	 */
	public EmployeeBean getEmployeeById(String id);
}
