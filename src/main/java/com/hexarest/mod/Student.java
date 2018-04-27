package com.hexarest.mod;

public class Student {
private Integer student_roll;
private String student_name;
private String student_standard;
private String student_group;
public Integer getStudent_roll() {
	return student_roll;
}
public void setStudent_roll(Integer student_roll) {
	this.student_roll = student_roll;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public String getStudent_standard() {
	return student_standard;
}
public void setStudent_standard(String student_standard) {
	this.student_standard = student_standard;
}
public String getStudent_group() {
	return student_group;
}
public void setStudent_group(String student_group) {
	this.student_group = student_group;
}
  public Student(){
  }
  
public  Student(Integer student_roll,String student_name,String student_standard,String student_group){
this.student_group=student_group;
this.student_name=student_name;
this.student_roll=student_roll;
this.student_standard=student_standard;


}
@Override
public String toString() {
	return "Student [student_roll=" + student_roll + ", student_name="
			+ student_name + ", student_standard=" + student_standard
			+ ", student_group=" + student_group + "]";
}

}
