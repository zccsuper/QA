package sh.global.qa.dao;

import java.util.List;

import sh.global.qa.bean.defect.DefectBean;
import sh.global.qa.bean.defect.DefectCategoryBean;
import sh.global.qa.bean.defect.MeasureBean;

public interface DefectDao {

	/**
	 * �ӿ�������ͨ��defect_id��ȡdefect
	 * @param defect_id
	 * @return DefectBean
	 * @author zcc
	 * @date 2014-07-20
	 */
	public DefectBean getDefectByDefectId(String defect_id);
	
	/**
	 * �ӿ�������ͨ��defect_id��ȡ���п��ܴ����ʩ
	 * @param defect_id
	 * @return List<MeasureBean>
	 * @author zcc
	 * @date 2014-07-20
	 */
	public List<MeasureBean> getMeasuresByDefectId(String defect_id);
	
	/**
	 * �ӿ�������ͨ��category_id��ȡ�������
	 * @param category_id
	 * @return List<MeasureBean>
	 * @author zcc
	 * @date 2014-07-20
	 */
	public DefectCategoryBean getDefectCategoryByCategoryId(String category_id);
}
