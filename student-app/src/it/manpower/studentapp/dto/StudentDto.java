package it.manpower.studentapp.dto;

public class StudentDto {
	private String name;
	private String surname;
	private String code;
	private String courses;
	private Integer mean;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public Integer getMean() {
		return mean;
	}

	public void setMean(Integer mean) {
		this.mean = mean;
	}

}
