package sh.global.qa.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import sh.global.qa.bean.EmployeeBean;
import sh.global.qa.dao.EmployeeDao;

/**
 * dao描述：员工数据操作
 * @author zcc
 * @date 2014-07-18
 */
public class EmployeeDaoImpl extends SqlMapClientDaoSupport implements EmployeeDao {

	/**
	 * 方法描述：根据员工id获得员工实体
	 * @param id
	 * @return EmployeeBean
	 * @author zcc
	 * @date 2014-07-18
	 */
	@Override
	public EmployeeBean getEmployeeById(String id) {
		EmployeeBean employee = (EmployeeBean) this.getSqlMapClientTemplate().queryForObject("getEmployeeById", id);
		return employee;
	}
	
}
