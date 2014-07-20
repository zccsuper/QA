package sh.global.qa.bean.defect;

import java.util.List;

/**
 * 实体描述：Defect（缺陷项）
 * @author zcc
 * @date 2014-07-20
 */
public class DefectBean {

	public String defect_id;				//缺陷id
	public String name;						//名称
	public List<MeasureBean> measure;		//可选择的处理措施
	public String category_id;				//缺陷分类id
	public String description;				//备注
	
	public String getDefect_id() {
		return defect_id;
	}
	public void setDefect_id(String defect_id) {
		this.defect_id = defect_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<MeasureBean> getMeasure() {
		return measure;
	}
	public void setMeasure(List<MeasureBean> measure) {
		this.measure = measure;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "DefectBean [defect_id=" + defect_id + ", name=" + name
				+ ", measure=" + measure + ", category_id=" + category_id
				+ ", description=" + description + "]";
	}
	
}
