package com.techlabs.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Contact;
import com.techlabs.entity.Credential;
import com.techlabs.entity.Partner;
import com.techlabs.entity.Tenant;
import com.techlabs.service.ContactService;
import com.techlabs.service.LoginService;
import com.techlabs.service.PartnerService;
import com.techlabs.service.TenantService;

public class RegistrationAction extends ActionSupport {

	WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());

	private TenantService tenantservice = (TenantService) context
			.getBean("tenantservice");

	private PartnerService partnerservice = (PartnerService) context
			.getBean("partnerservice");
	private ContactService contactservice = (ContactService) context
			.getBean("contactservice");

	private LoginService loginservice = (LoginService) context
			.getBean("loginservice");
	private String fname;
	private String lname;
	private long contact;
	private String email;
	private String tenant_name;
	private String address;
	private String city;
	private String state;
	private int pincode;
	private String country;
	private String url;
	private String currency;
	private boolean urlExists;
	private boolean contactExists;
	private String username;
	private String password;

	@Override
	public String execute() {

		System.out.println("coming to execute method");
		long tenant_id = tenantservice.generateTanantId();
		Tenant newtenant = new Tenant(tenant_id, tenant_name, address, city,
				state, pincode, country, url, currency);
		urlExists = tenantservice.checkTanantURLExists(url);
		if (!urlExists) {
			System.out.println("Tenant does not exist");

			List<Partner> partners = partnerservice.getAllPartners();
			System.out.println("List of partners are " + partners);

			Partner partner = partnerservice.getRandomPartner(partners);
			System.out.println("Random partner is " + partner);

			newtenant.setPartner(partner);
			tenantservice.createNewtenant(newtenant);

			int id = contactservice.generateContactId();
			Contact newcontact = new Contact(id, fname, lname, contact, email,
					newtenant);
			contactservice.saveTenantContact(newcontact);

			return "success";
		}
		return "success";

	}

	public String saveDetails() {
		System.out.println("coming to save method in struts 2 registration action");
		
		Tenant tenant = tenantservice.getTenantByUrl(url);
		Credential credential = new Credential(username, password, "unlocked",
				tenant);
		loginservice.saveCredentials(credential);
		
		
		return "success";
	}

	public String getTenant_name() {
		return tenant_name;
	}

	public void setTenant_name(String tenant_name) {
		this.tenant_name = tenant_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isUrlExists() {
		return urlExists;
	}

	public void setUrlExists(boolean urlExists) {
		this.urlExists = urlExists;
	}

	public boolean isContactExists() {
		return contactExists;
	}

	public void setContactExists(boolean contactExists) {
		this.contactExists = contactExists;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}