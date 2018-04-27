package com.hexarest.da;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.hexarest.mod.Student;

public class Studentdao {

	List<Student> students = null;

	public Collection<Student> getAllStudents() {
		Student s1 = new Student(1, "sharath1", "tenth", "lotus");
		Student s2 = new Student(2, "sharath2", "tenth", "lotus");
		Student s3 = new Student(3, "sharath3", "tenth", "lotus");
		Student s4 = new Student(4, "sharath4", "seven", "rose");
		Student s5 = new Student(5, "sharath5", "seven", "rose");
		Student s6 = new Student(6, "sharath6", "six", "lilly");
		Student s7 = new Student(7, "sharath7", "six", "lilly");
		Map<Integer, Student> studentsval = new HashMap<Integer, Student>();
		studentsval.put(1, s1);
		studentsval.put(2, s2);
		studentsval.put(3, s3);
		studentsval.put(4, s4);
		studentsval.put(5, s5);
		studentsval.put(6, s6);
		studentsval.put(7, s7);
		Set<Entry<Integer, Student>> values = studentsval.entrySet();
		Iterator<Entry<Integer, Student>> itr = values.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, Student> stud = (Entry<Integer, Student>) itr
					.next();
			int keys = stud.getKey();
			Student students = stud.getValue();
			// System.out.println(keys);
			// System.out.println(students.getStudent_group());
		}
		return studentsval.values();

	}

	public Student getStudentById(Integer roll) {
		List<Student> students = new ArrayList<Student>(getAllStudents());
		Student stu = null;
		Iterator<Student> itr = students.iterator();
		while (itr.hasNext()) {
			Student s = itr.next();
			// System.out.println(s.getStudent_roll());
			if (s.getStudent_roll() == roll) {
				// System.out.println(s);
				stu = s;
				// System.out.println(stu);
				return stu;
			}
		}
		return stu;
	}

	public Student getStudentByName(String name) {
		List<Student> students = new ArrayList<Student>(getAllStudents());
		Student stu = null;
		Iterator<Student> itr = students.iterator();

		while (itr.hasNext()) {
			Student s = itr.next();
			// System.out.println(s.getStudent_roll());
			String name2 = name.replaceAll("\\s+", "");
			if (s.getStudent_name().equalsIgnoreCase(name2)) {
				// System.out.println(s);
				stu = s;
				// System.out.println(stu);
				return stu;
			}
		}
		return stu;
	}
	
	
	
	

	public static void main(String args[]) {
		Studentdao dao = new Studentdao();

		Collection<Student> stud = dao.getAllStudents();

		// System.out.println(stud);
		Student stud2 = new Student();
		Student stud1 = dao.getStudentById(6);
		Student stud3 = dao.getStudentByName("sharath 1");

		System.out.println(stud3);
	}

}
