package com.webservice.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Student")
public class Student {

	private String id;
	private String num;
	private String name;
	private String tel;
	private String address;

	public Student(){};
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student(String id, String num, String name, String tel, String address) {
		super();
		this.id = id;
		this.num = num;
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	@Override
	public String toString() {
		return "[ id="+id+", number="+num+", name="+name+", tel="+tel+", address="+address+" ]";
	}
}
