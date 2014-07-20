package sh.global.qa.dao;

import java.util.List;

import sh.global.qa.bean.defect.DefectBean;
import sh.global.qa.bean.defect.DefectCategoryBean;
import sh.global.qa.bean.defect.MeasureBean;

public interface DefectDao {

	/**
	 * 接口描述：通过defect_id获取defect
	 * @param defect_id
	 * @return DefectBean
	 * @author zcc
	 * @date 2014-07-20
	 */
	public DefectBean getDefectByDefectId(String defect_id);
	
	/**
	 * 接口描述：通过defect_id获取所有可能处理措施
	 * @param defect_id
	 * @return List<MeasureBean>
	 * @author zcc
	 * @date 2014-07-20
	 */
	public List<MeasureBean> getMeasuresByDefectId(String defect_id);
	
	/**
	 * 接口描述：通过category_id获取分类类别
	 * @param category_id
	 * @return List<MeasureBean>
	 * @author zcc
	 * @date 2014-07-20
	 */
	public DefectCategoryBean getDefectCategoryByCategoryId(String category_id);
}
