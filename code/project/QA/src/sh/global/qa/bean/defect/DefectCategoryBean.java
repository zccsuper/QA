package sh.global.qa.bean.defect;

/**
 * ʵ��������Defect Category��ȱ������ࣩ
 * @author zcc
 * @date 2014-07-20
 */
public class DefectCategoryBean {
	
	public String category_id;				//����id
	public String name;						//������
	public String description;				//��������
	
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "DefectCategoryBean [category_id=" + category_id + ", name="
				+ name + ", description=" + description + "]";
	}
	
}
