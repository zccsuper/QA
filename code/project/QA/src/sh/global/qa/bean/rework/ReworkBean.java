package sh.global.qa.bean.rework;

import java.util.Date;
import java.util.List;


/**
 * 实体描述：Rework（返工单）
 * @author zcc
 * @date 2014-07-18
 */
public class ReworkBean {

	public String order_id;						//报废品处置单号
	public String po_no;						//订单号
	public String part_no;						//零件图号
	public String part_rev;						//零件版本号
	public int quantity;						//数量
	public String PIC_id;						//负责人工号
	public String description;					//原因描述
	public String measure;						//处理措施
	public String type;							//内部或外部造成的
	public String cooperator_id;				//外协厂家id
	public Date cr_date;						//创建时间
	public String creator_id;					//创建者工号
	public String status;						//返工状态
	public int rework_done_number;				//返工完成件数
	public int rework_failed_number;			//返工失败件数
	public Date refresh_time;					//最新更改时间
	public List<ReworkLogBean> logo_list;		//操作日志表
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getPo_no() {
		return po_no;
	}
	public void setPo_no(String po_no) {
		this.po_no = po_no;
	}
	public String getPart_no() {
		return part_no;
	}
	public void setPart_no(String part_no) {
		this.part_no = part_no;
	}
	public String getPart_rev() {
		return part_rev;
	}
	public void setPart_rev(String part_rev) {
		this.part_rev = part_rev;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPIC_id() {
		return PIC_id;
	}
	public void setPIC_id(String pIC_id) {
		PIC_id = pIC_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMeasure() {
		return measure;
	}
	public void setMeasure(String measure) {
		this.measure = measure;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCooperator_id() {
		return cooperator_id;
	}
	public void setCooperator_id(String cooperator_id) {
		this.cooperator_id = cooperator_id;
	}
	public Date getCr_date() {
		return cr_date;
	}
	public void setCr_date(Date cr_date) {
		this.cr_date = cr_date;
	}
	public String getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(String creator_id) {
		this.creator_id = creator_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getRework_done_number() {
		return rework_done_number;
	}
	public void setRework_done_number(int rework_done_number) {
		this.rework_done_number = rework_done_number;
	}
	public int getRework_failed_number() {
		return rework_failed_number;
	}
	public void setRework_failed_number(int rework_failed_number) {
		this.rework_failed_number = rework_failed_number;
	}
	public Date getRefresh_time() {
		return refresh_time;
	}
	public void setRefresh_time(Date refresh_time) {
		this.refresh_time = refresh_time;
	}
	public List<ReworkLogBean> getLogo_list() {
		return logo_list;
	}
	public void setLogo_list(List<ReworkLogBean> logo_list) {
		this.logo_list = logo_list;
	}
	
	@Override
	public String toString() {
		return "ReworkBean [order_id=" + order_id + ", po_no=" + po_no
				+ ", part_no=" + part_no + ", part_rev=" + part_rev
				+ ", quantity=" + quantity + ", PIC_id=" + PIC_id
				+ ", description=" + description + ", measure=" + measure
				+ ", type=" + type + ", cooperator_id=" + cooperator_id
				+ ", cr_date=" + cr_date + ", creator_id=" + creator_id
				+ ", status=" + status + ", rework_done_number="
				+ rework_done_number + ", rework_failed_number="
				+ rework_failed_number + ", refresh_time=" + refresh_time
				+ ", logo_list=" + logo_list + "]";
	}
	
}
