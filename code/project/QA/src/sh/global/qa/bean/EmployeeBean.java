package sh.global.qa.bean;

/**
 * ʵ��������Employee��Ա����
 * @author zcc
 * @date 2014-07-18
 */
public class EmployeeBean {
	
	public String id;			//Ա������
	public String name;			//Ա������
	public String role_id;		//��ɫid
	
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
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", role_id="
				+ role_id + "]";
	}

	
}
