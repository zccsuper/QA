package sh.global.qa.dao;

import java.util.List;

import sh.global.qa.bean.RoleBean;

public interface RoleDao {

	/**
	 * 接口描述：获取所有角色信息
	 * @param null
	 * @return List<RoleBean>
	 * @author zcc
	 * @date 2014-07-18
	 */
	public List<RoleBean> getAllRoles();
	
}
