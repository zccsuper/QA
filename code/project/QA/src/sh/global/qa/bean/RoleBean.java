package sh.global.qa.bean;

/**
 * ʵ��������Role��Ա����ɫ��
 * @author zcc
 * @date 2014-07-18
 */
public class RoleBean {

	public String id;				//��ɫid
	public String name;				//��ɫ��
	
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
