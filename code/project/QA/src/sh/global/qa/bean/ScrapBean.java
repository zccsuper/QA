package sh.global.qa.bean;

import java.util.Date;

/**
 * ʵ��������Scrap�����ϵ���
 * @author zcc
 * @date 2014-07-18
 */
public class ScrapBean {

	public String order_id;				//����Ʒ���õ���
	public String po_no;				//������
	public String part_no;				//���ͼ��
	public String part_rev;				//����汾��
	public int quantity;				//����
	public String PIC_id;				//�����˹���
	public String description;			//ԭ������
	public String measure;				//�����ʩ
	public String type;					//�ڲ����ⲿ��ɵ�
	public String cooperator_id;		//��Э����id
	public Date cr_date;				//����ʱ��
	public String creator_id;			//�����߹���
	
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
	
	@Override
	public String toString() {
		return "ScrapBean [order_id=" + order_id + ", po_no=" + po_no
				+ ", part_no=" + part_no + ", part_rev=" + part_rev
				+ ", quantity=" + quantity + ", PIC_id=" + PIC_id
				+ ", description=" + description + ", measure=" + measure
				+ ", type=" + type + ", cooperator_id=" + cooperator_id
				+ ", cr_date=" + cr_date + ", creator_id=" + creator_id + "]";
	}

}
