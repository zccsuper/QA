package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sh.global.qa.dao.impl.CooperatorDaoImpl;
import sh.global.qa.dao.impl.DefectDaoImpl;
import sh.global.qa.dao.impl.EmployeeDaoImpl;
import sh.global.qa.dao.impl.ReworkDaoImpl;
import sh.global.qa.dao.impl.RoleDaoImpl;
import sh.global.qa.dao.impl.ScrapDaoImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		CooperatorDaoImpl cooperatorBean = (CooperatorDaoImpl) context.getBean("cooperatorDao");
//		System.out.println(cooperatorBean.getAllCooperators());
//		ScrapDaoImpl scrapDaoImpl = (ScrapDaoImpl) context.getBean("scrapDao");
//		System.out.println(scrapDaoImpl.getScrapByOrderId("00001"));
//		ReworkDaoImpl reworkDaoImpl = (ReworkDaoImpl) context.getBean("reworkDao");
//		System.out.println(reworkDaoImpl.getReworkLogsByOrderId("0001"));
		DefectDaoImpl defectDaoImpl = (DefectDaoImpl) context.getBean("defectDao");
		System.out.println(defectDaoImpl.getDefectCategoryByCategoryId("00002"));
	}
	
}
