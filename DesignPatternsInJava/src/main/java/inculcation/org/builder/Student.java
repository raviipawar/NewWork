package inculcation.org.builder;

import java.util.List;

public class Student {

	private String name;
	private String gender;
	private int age;
	private String address;
	private List<String> aoi;

	public Student(String name, String gender, int age, String address, List<String> aoi) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.aoi = aoi;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + ", aoi=" + aoi
				+ "]";
	}
	

}
