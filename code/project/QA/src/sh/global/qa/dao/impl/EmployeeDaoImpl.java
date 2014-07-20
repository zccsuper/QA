package sh.global.qa.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import sh.global.qa.bean.EmployeeBean;
import sh.global.qa.dao.EmployeeDao;

/**
 * dao������Ա�����ݲ���
 * @author zcc
 * @date 2014-07-18
 */
public class EmployeeDaoImpl extends SqlMapClientDaoSupport implements EmployeeDao {

	/**
	 * ��������������Ա��id���Ա��ʵ��
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
