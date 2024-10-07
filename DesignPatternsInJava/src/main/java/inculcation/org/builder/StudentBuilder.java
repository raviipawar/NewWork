package inculcation.org.builder;

import java.util.List;

public class StudentBuilder {

	private String name;
	private String gender;
	private int age;
	private String address;
	private List<String> aoi;

	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public StudentBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}
	public StudentBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public StudentBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	public StudentBuilder setAoi(List<String> aoi) {
		this.aoi = aoi;
		return this;
	}
	
	public Student getStudent() {
		return new Student(name,gender,age,address,aoi);
	}
	
	

}
