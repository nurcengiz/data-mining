package com.seher.dataxml.service.requests;

public class ObesityRequest {
	
	private int age;
	
	private int heigth;
	
	private int weigth;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public ObesityRequest() {
		super();
	}

	public ObesityRequest(int age, int heigth, int weigth) {
		super();
		this.age = age;
		this.heigth = heigth;
		this.weigth = weigth;
	}

}
