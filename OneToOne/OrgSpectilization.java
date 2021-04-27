package com.tyss.onetoone.practise.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class OrgSpectilization {
	@Id
	@Column
private int id;
	@Column
private String Specialized;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getSpecialized() {
//		return Specialized;
//	}
//	public void setSpecialized(String specialized) {
//		Specialized = specialized;
//	}
}
