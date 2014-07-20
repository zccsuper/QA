package sh.global.qa.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import sh.global.qa.bean.RoleBean;
import sh.global.qa.dao.RoleDao;

/**
 * dao��������ɫ���ݲ���
 * @author zcc
 * @date 2014-07-18
 */
public class RoleDaoImpl extends SqlMapClientDaoSupport implements RoleDao {

	/**
	 * ������������ȡ���н�ɫ��Ϣ
	 * @param null
	 * @return List<RoleBean>
	 * @author zcc
	 * @date 2014-07-18
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<RoleBean> getAllRoles() {
		List<RoleBean> list = this.getSqlMapClientTemplate().queryForList("getAllRoles");
		return list;
	}

}
