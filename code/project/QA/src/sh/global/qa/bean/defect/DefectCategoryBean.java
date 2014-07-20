package sh.global.qa.bean.defect;

/**
 * 实体描述：Defect Category（缺陷项分类）
 * @author zcc
 * @date 2014-07-20
 */
public class DefectCategoryBean {
	
	public String category_id;				//分类id
	public String name;						//分类名
	public String description;				//分类描述
	
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
