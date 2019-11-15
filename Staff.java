package Assignment.JSON;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Staff {
	private String name;
	private int age;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String[] positon;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<String> skills;
	private Map<String, BigDecimal> salary;
	
	@Override
	public String toString() {
		return "Staff { name=" + name + ", age=" + age + ", positon=" + Arrays.toString(positon) + ", skills=" + skills
				+ ", salary=" + salary + "}";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String[] getPositon() {
		return positon;
	}
	
	public void setPositon(String[] positon) {
		this.positon = positon;
	}
	
	public List<String> getSkills() {
		return skills;
	}
	
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	public Map<String, BigDecimal> getSalary() {
		return salary;
	}
	
	public void setSalary(Map<String, BigDecimal> salary) {
		this.salary = salary;
	}
}
