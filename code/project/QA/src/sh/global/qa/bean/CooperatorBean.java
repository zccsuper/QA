package sh.global.qa.bean;

/**
 * 实体描述：Cooperator Company（外协厂家）
 * @author zcc
 * @date 2014-07-18
 */
public class CooperatorBean {

	public String id;				//外协厂家id
	public String name;				//外协厂家名称
	
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
