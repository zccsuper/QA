package sh.global.qa.bean.defect;

/**
 * 实体描述：Measure（缺陷项的处理措施）
 * @author zcc
 * @date 2014-07-20
 */
public class MeasureBean {

	public String measure_id;			//处理措施id
	public String defect_id;			//对应缺陷id
	public String description;			//措施描述
	
	public String getMeasure_id() {
		return measure_id;
	}
	public void setMeasure_id(String measure_id) {
		this.measure_id = measure_id;
	}
	public String getDefect_id() {
		return defect_id;
	}
	public void setDefect_id(String defect_id) {
		this.defect_id = defect_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "MeasureBean [measure_id=" + measure_id + ", defect_id="
				+ defect_id + ", description=" + description + "]";
	}
	
	
}
