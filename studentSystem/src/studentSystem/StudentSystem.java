package studentSystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentSystem {
	// 创建一个能够存放5个班级的数组
	private static Clazz[] clazzs = new Clazz[5];
	// 定义班级数组的下标
	private static int clazzIndex = 0;
	// 创建一个学生数组
	private static Student[] students = new Student[10000];
	// 定义学生数组的下标
	private static int index = 0;

	public static void main(String[] args) {
		while (true) {
			System.out.println("Welcome to StudentSystem!");
			System.out.println("请选择以下功能：");
			System.out.println("100.新增班级");
			System.out.println("200.新增学生");
			System.out.println("300.删除学生");
			System.out.println("400.更新学生信息");
			System.out.println("500.显示所有学生信息");
			System.out.println("600.根据id查询学生信息");
			System.out.println("700.根据姓名查询学生信息");
			System.out.println("800.关闭系统");
			System.out.println("请输入您要选择的功能：");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num == 100) {
				// System.out.println("请新增班级：");
				createClazz();
			} else if (num == 200) {
				// System.out.println("请新增学生：");
				if (clazzIndex == 0) {
					createClazz();
				} else {
					addStudent();
				}
			} else if (num == 300) {
//				System.out.println("请删除学生：");
				System.out.println("请输入要删除学生的id：");
				int id = new Scanner(System.in).nextInt();
				boolean isDelete = deleteStudent(id);
				if (isDelete) {
					System.out.println("id为"+id+"的学生已删除");
				}else{
					System.out.println("对不起，没有id为" + id + "的学生");
				}
			} else if (num == 400) {
				System.out.println("请选择要修改的学生id：");
			} else if (num == 500) {
				System.out.println("以下是所有学生信息：");
			} else if (num == 600) {
				System.out.println("请输入学生id：");
			} else if (num == 700) {
				System.out.println("请输入学生姓名：");
			} else if (num == 800) {
				System.out.println("System close...");
				System.exit(0);
			} else {
				System.out.println("您输入的信息不正确，请重新输入：");
				num = new Scanner(System.in).nextInt();
			}
		}
	}
//删除学生
	private static boolean deleteStudent(int id) {
		for (int i = 0; i < students.length; i++) {
			//找出不为空的学生，把要删除的学生通过id找出来，然后把值赋为空
			if (students[i] != null && id == students[i].getId()) {
				students[i] = null;
				return true;
			}
		}
		return false;
	}

	private static void addStudent() {
		Student stu = new Student();
		// 学生学号
		stu.setId(GeneratorId.nextId());
		// 学生姓名
		System.out.println("请输入学生姓名：");
		String name = new Scanner(System.in).nextLine();
		stu.setName(name);
		// 学生年龄
		System.out.println("请输入学生年龄：");
		int age = new Scanner(System.in).nextInt();
		stu.setAge(age);
		// 学生入学日期
		Date date = new Date();
		stu.setDate(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String dateString = sdf.format(date);
		System.out.println(dateString);
		// 学生班级
		System.out.println("请选择以下班级：");
		for (int i = 0; i < clazzs.length; i++) {
			if (clazzs[i] != null) {
				System.out.println((i + 1) + "." + clazzs[i]);
			}
		}
		int clazzNumber = new Scanner(System.in).nextInt();
		stu.setClazz(clazzs[clazzNumber - 1]);

		students[index++] = stu;

	}

	// 创建班级
	private static void createClazz() {
		Clazz clazz = new Clazz();
		System.out.println("请输入班级年级：");
		Scanner sc = new Scanner(System.in);
		// 键盘录入年级
		String grade = sc.nextLine();
		clazz.setGrade(grade);
		System.out.println("请输入班号：");
		// 键盘录入班号
		int number = sc.nextInt();
		clazz.setNumber(number);
		// 把创建好的班级放到班级数组里
		clazzs[clazzIndex++] = clazz;
	}
}
