package sh.global.qa.bean.rework;

import java.util.Date;

public class ReworkLogBean {

	public String logo_id;					//��־Ψһ��ʶ��
	public String order_id;					//��������
	public String description;				//��־��������
	public String creator_id;				//�����߹���
	public Date	cr_date;					//����ʱ��
	
	public String getLogo_id() {
		return logo_id;
	}
	public void setLogo_id(String logo_id) {
		this.logo_id = logo_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(String creator_id) {
		this.creator_id = creator_id;
	}
	public Date getCr_date() {
		return cr_date;
	}
	public void setCr_date(Date cr_date) {
		this.cr_date = cr_date;
	}
	
	@Override
	public String toString() {
		return "ReworkLogBean [logo_id=" + logo_id + ", order_id=" + order_id
				+ ", description=" + description + ", creator_id=" + creator_id
				+ ", cr_date=" + cr_date + "]";
	}
	
}
