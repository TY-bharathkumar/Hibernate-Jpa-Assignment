package com.tyss.onetoone.practise.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Organization {
	@Id
	private int org_id;
	@Column
	private String org_name;
	@Column
	private String quote;
	@OneToOne(cascade = CascadeType.ALL)
	private OrgSpectilization orgspc;
//	public OrgSpectilization getOrgspc() {
//		return orgspc;
//	}
//	public void setOrgspc(OrgSpectilization orgspc) {
//		this.orgspc = orgspc;
//	}
//	public int getOrg_id() {
//		return org_id;
//	}
//	public void setOrg_id(int org_id) {
//		this.org_id = org_id;
//	}
//	public String getOrg_name() {
//		return org_name;
//	}
//	public void setOrg_name(String org_name) {
//		this.org_name = org_name;
//	}
//	public String getQuote() {
//		return quote;
//	}
//	public void setQuote(String quote) {
//		this.quote = quote;
//	}

}
