package sh.global.qa.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import sh.global.qa.bean.RoleBean;
import sh.global.qa.dao.RoleDao;

/**
 * dao描述：角色数据操作
 * @author zcc
 * @date 2014-07-18
 */
public class RoleDaoImpl extends SqlMapClientDaoSupport implements RoleDao {

	/**
	 * 方法描述：获取所有角色信息
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
