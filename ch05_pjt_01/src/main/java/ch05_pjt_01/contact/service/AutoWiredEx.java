package ch05_pjt_01.contact.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoWiredEx {
	@Inject
	@Named("firstBean1")
	public AutoWiredEx(@Qualifier("usedBean") FirstBean fBean, SecondBean sBean) {
		System.out.println("fBean: " + fBean);
		System.out.println("sBean: " + sBean);
	}
	
	@Inject
	@Named("fourthBean1")
	public void autowiredMethod(ThirdBean tBean, @Qualifier("usedBean") FourtBean fBean ) {
		System.out.println("tBean: " + tBean);
		System.out.println("fBean: " + fBean);
	}
	
}
