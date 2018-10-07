package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Module;
import com.techlabs.repository.SupportRepo;

@Service("supportservice")
public class SupportService {

	@Autowired
	private SupportRepo support_repo;

	public List<com.techlabs.entity.Service> GetAllSupportService() {
		return this.support_repo.GetAllSupportService();
	}
	public com.techlabs.entity.Service getSupportServiceById(long service_id){
		return this.support_repo.getServiceById(service_id);
		
	}
	public SupportRepo getSupport_repo() {
		return support_repo;
	}

	@Autowired
	public void setSupport_repo(SupportRepo support_repo) {
		this.support_repo = support_repo;
	}

}