package studentSystem;

import java.util.Scanner;

public class StudentSystem {
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
			if(num == 100){
				System.out.println("请新增班级：");
			}else if(num == 200){
				System.out.println("请新增学生："); 
			}else if(num == 300){
				System.out.println("请删除学生：");
			}else if(num == 400){
				System.out.println("请选择要修改的学生id：");
			}else if(num == 500){
				System.out.println("以下是所有学生信息：");
			}else if(num == 600){
				System.out.println("请输入学生id：");
			}else if(num == 700){
				System.out.println("请输入学生姓名：");
			}else if(num == 800){
				System.out.println("System close...");
				System.exit(0);
			}else{
				System.out.println("您输入的信息不正确，请重新输入：");
				num = new Scanner(System.in).nextInt();
			}
		}
	}
}
