package sh.global.qa.bean;

/**
 * ʵ��������Cooperator Company����Э���ң�
 * @author zcc
 * @date 2014-07-18
 */
public class CooperatorBean {

	public String id;				//��Э����id
	public String name;				//��Э��������
	
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
		return "CooperatorBean [id=" + id + ", name=" + name + "]";
	}
	
}
