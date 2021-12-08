package com.sonata2;

public class Manager extends Employee {
	Manager(int a,String b){
		this.empId=a;
		this.empName=b;
	}
public double SalCal(int a) {
	this.empSalary=a*1.15;
	return this.empSalary;
}
public static void main(String[]arg) {
	Manager e1=new Manager(200,"harsha");
	e1.SalCal(20000);
	e1.display();

}
}
