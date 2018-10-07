package com.techlabs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Partner")
public class Partner {

	@Id
	@Column(name="partner_id")
	private long partner_id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(mappedBy="partner",cascade = CascadeType.ALL)
	private Tenant tenant;

	public Partner(){
		
	}
	public Partner(long partner_id, String name, Tenant tenant) {
		super();
		this.partner_id = partner_id;
		this.name = name;
		this.tenant = tenant;
	}

	public long getPartner_id() {
		return partner_id;
	}

	public void setPartner_id(long partner_id) {
		this.partner_id = partner_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	
	
}
