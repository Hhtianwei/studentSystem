package studentSystem;

public class Clazz {
	private String grade;// 年级
	private int number;// 班级

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Clazz [grade=" + grade + ", number=" + number + "]";
	}

}
