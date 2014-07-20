package sh.global.qa.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import sh.global.qa.bean.defect.DefectBean;
import sh.global.qa.bean.defect.DefectCategoryBean;
import sh.global.qa.bean.defect.MeasureBean;
import sh.global.qa.dao.DefectDao;

/**
 * dao������ȱ�������ݲ���
 * @author zcc
 * @date 2014-07-20
 */
public class DefectDaoImpl extends SqlMapClientDaoSupport implements DefectDao {

	/**
	 * ����������ͨ��defect_id��ȡdefect
	 * @param defect_id
	 * @return DefectBean
	 * @author zcc
	 * @date 2014-07-20
	 */
	@Override
	public DefectBean getDefectByDefectId(String defect_id) {
		DefectBean defect = (DefectBean) this.getSqlMapClientTemplate().queryForObject("getDefectByDefectId", defect_id);
		List<MeasureBean> measureList = this.getMeasuresByDefectId(defect_id);
		defect.setMeasure(measureList);
		return defect;
	}

	/**
	 * ����������ͨ��defect_id��ȡ���п��ܴ����ʩ
	 * @param defect_id
	 * @return List<MeasureBean>
	 * @author zcc
	 * @date 2014-07-20
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<MeasureBean> getMeasuresByDefectId(String defect_id) {
		List<MeasureBean> list = this.getSqlMapClientTemplate().queryForList("getMeasuresByDefectId", defect_id);
		return list;
	}

	/**
	 * ����������ͨ��category_id��ȡ�������
	 * @param category_id
	 * @return DefectCategoryBean
	 * @author zcc
	 * @date 2014-07-20
	 */
	@Override
	public DefectCategoryBean getDefectCategoryByCategoryId(String category_id) {
		DefectCategoryBean defectCategory = (DefectCategoryBean) this.getSqlMapClientTemplate().
				queryForObject("getDefectCategoryByCategoryId", category_id);
		return defectCategory;
	}

}
