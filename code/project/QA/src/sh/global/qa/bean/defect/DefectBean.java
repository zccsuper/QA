package sh.global.qa.bean.defect;

import java.util.List;

/**
 * ʵ��������Defect��ȱ���
 * @author zcc
 * @date 2014-07-20
 */
public class DefectBean {

	public String defect_id;				//ȱ��id
	public String name;						//����
	public List<MeasureBean> measure;		//��ѡ��Ĵ����ʩ
	public String category_id;				//ȱ�ݷ���id
	public String description;				//��ע
	
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
