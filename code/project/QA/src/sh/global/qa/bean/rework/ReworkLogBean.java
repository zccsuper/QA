package sh.global.qa.bean.rework;

import java.util.Date;

public class ReworkLogBean {

	public String logo_id;					//日志唯一标识号
	public String order_id;					//返工单号
	public String description;				//日志操作描述
	public String creator_id;				//创建者工号
	public Date	cr_date;					//创建时间
	
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
