package com.tns.placementservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Placement {
	private Integer P_companyid;
	private String P_companyname;
	private String P_skills;
	private Integer P_salary;

	public Placement() {
		super();
	}
	
	public Placement(Integer p_companyid, String p_companyname, String p_skills, Integer p_salary) {
		super();
		P_companyid = p_companyid;
		P_companyname = p_companyname;
		P_skills = p_skills;
		P_salary = p_salary;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getP_companyid() {
		return P_companyid;
	}
	public void setP_companyid(Integer p_companyid) {
		P_companyid = p_companyid;
	}
	public String getP_companyname() {
		return P_companyname;
	}
	public void setP_companyname(String p_companyname) {
		P_companyname = p_companyname;
	}
	public String getP_skills() {
		return P_skills;
	}
	public void setP_skills(String p_skills) {
		P_skills = p_skills;
	}
	public Integer getP_salaryp() {
		return P_salary;
	}
	public void setP_salary(Integer p_salary) {
		P_salary = p_salary;
	}
	@Override
	public String toString()
	{
		return "Placement[Placement companyid:"+P_companyid+" Placement conpanyname"+P_companyname+" Placement skils"+P_skills+" Placement salarypackage"+P_salary+"]";
	}
	

}
