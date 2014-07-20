package sh.global.qa.bean;

/**
 * 实体描述：Role（员工角色）
 * @author zcc
 * @date 2014-07-18
 */
public class RoleBean {

	public String id;				//角色id
	public String name;				//角色名
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "RoleBean [id=" + id + ", name=" + name + "]";
	}
	
}
