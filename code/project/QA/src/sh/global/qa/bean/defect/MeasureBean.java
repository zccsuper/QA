package sh.global.qa.bean.defect;

/**
 * ʵ��������Measure��ȱ����Ĵ����ʩ��
 * @author zcc
 * @date 2014-07-20
 */
public class MeasureBean {

	public String measure_id;			//�����ʩid
	public String defect_id;			//��Ӧȱ��id
	public String description;			//��ʩ����
	
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
