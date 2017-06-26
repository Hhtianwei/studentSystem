package studentSystem;

import java.util.Date;

public class Student {
	// 学生学号
	private int id;
	// 学生姓名
	private String name;
	// 学生年龄
	private int age;
	// 学生入学日期
	private Date date;
	// 学生班级
	private Clazz clazz;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", date=" + date + ", clazz=" + clazz + "]";
	}
	
	
}
