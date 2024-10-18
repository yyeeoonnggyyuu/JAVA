package ch05_pjt_01.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDao;

public class ContactSearchService {
	@Inject
	@Named("contactDao1")
//	@Autowired
//	@Qualifier("usedDao")
	private ContactDao contactDao;

//	public ContactSearchService() {
//		System.out.println("SearchService default constructor");
//	}
//	@Autowired
//
//	public ContactSearchService(ContactDao contactDao) {
//		System.out.println("contectDao" + contactDao);
//		this.contactDao = contactDao;
//	}
//	
	
	
	public ContactSet searchContact(String name) {
		if(verify(name)) {
			return contactDao.select(name);
			} else {
			System.out.println("Contact information is available");
			
		}
		return null;
	}

	public boolean verify(String name) {
		ContactSet contactSet = contactDao.select(name);
		return contactSet != null ? true : false;
	}

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}
}