package com.DTO;

public class MemberDTO {
	private String company_id;	
	private String email;
	private String pw;
	private String name;	
	private String companyName;	//��ü��
	private String phone;
	private String companyImg;	//
	private String locateion;	//�� �ּ�
	
	public MemberDTO() {}

	@Override
	public String toString() {
		return "MemberDTO [company_id=" + company_id + ", pw=" + pw + ", name=" + name + ", companyName=" + companyName + ", phone="
				+ phone + ", email=" + email + ", companyImg=" + companyImg + ", locateion=" + locateion + "]";
	}

	public String getCompany_Id() {
		return company_id;
	}

	public void setCompany_Id(String company_id) {
		this.company_id = company_id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyImg() {
		return companyImg;
	}

	public void setCompanyImg(String companyImg) {
		this.companyImg = companyImg;
	}

	public String getLocateion() {
		return locateion;
	}

	public void setLocateion(String locateion) {
		this.locateion = locateion;
	}
	

	
}