package com.techlabs.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Tenant;
import com.techlabs.repository.TenantRepo;

@Service("tenantservice")
public class TenantService {

	@Autowired
	private TenantRepo tenant_repo;

	public boolean checkTanantURLExists(String url) {
		return this.tenant_repo.checkTanantURLExists(url);
	}

	public long generateTanantId() {
		return Math.abs(UUID.randomUUID().getMostSignificantBits());
	}

	public void createNewtenant(Tenant newtenant) {
		this.tenant_repo.createNewtenant(newtenant);
	}
	public List<Tenant> getAllTenants(){
		return this.tenant_repo.getAllTenants();
	}

	public Tenant getTenantById(long tenant_id) {
		return this.tenant_repo.getTenantById(tenant_id);
	}
	public Tenant getTenantByUrl(String url) {
		return this.tenant_repo.getTenantByUrl(url);
	}

	public TenantRepo getTenant_repo() {
		return tenant_repo;
	}

	@Autowired
	public void setTenant_repo(TenantRepo tenant_repo) {
		this.tenant_repo = tenant_repo;
	}

}
