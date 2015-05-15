package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PopulateRepository {
	public ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	public ArrayList<Student> students = new ArrayList<Student>();
	public ArrayList<Faculty> faculties = new ArrayList<Faculty>();
	public ArrayList<Lecture> lectures = new ArrayList<Lecture>();
	public ArrayList<Admin> admins = new ArrayList<Admin>();
	
	public void populateAdmins() {
		// TODO Auto-generated method stub
		Admin user = new Admin(1,"mate","123","admin1");
		Admin user2 = new Admin(2,"nano","123","admin2");
		admins.add(user);admins.add(user2);
	}
	public void populateLectures() {
		// TODO Auto-generated method stub
		Lecture lect1 = new Lecture(1,"mate",8);
		Lecture lect2 = new Lecture(2,"info",8);
		Lecture lect3 = new Lecture(3,"romana",6);
		Lecture lect4 = new Lecture(4,"english",4);
		Lecture lect5 = new Lecture(5,"gym",2);
		Lecture lect6 = new Lecture(6,"oop",6);
		lectures.add(lect1);lectures.add(lect2);lectures.add(lect3);lectures.add(lect4);lectures.add(lect5);lectures.add(lect6);
		
	}
	public void populateFaculties() {
		// TODO Auto-generated method stub
		Faculty fac = new Faculty(1,"Babes-Bolyai","Campului,nr.2",lectures);
		Faculty fac2 = new Faculty(1,"UTC","Campului,nr.2",lectures);
		faculties.add(fac);faculties.add(fac2);
	}
	public ArrayList<Student> populateStudents() {
		// TODO Auto-generated method stub
		Map<String,Integer> grades = new HashMap<String,Integer>();
		grades.put("mate", 10);
		Student st1 = new Student(1,"st1","123","Student1","1235","Marinel,nr.3",faculties,lectures,grades);
		grades.put("English", 9);
		Student st2 = new Student(2,"st2","123","Student2","1235","Marinel,nr.3",faculties,lectures,grades);
		grades.put("oop", 10);
		Student st3 = new Student(3,"st3","123","Student3","1235","Marinel,nr.3",faculties,lectures,grades);
		students.add(st1);students.add(st2);students.add(st3);
		return students;
		
	}
	public void populateTeachers() {
		// TODO Auto-generated method stub
		Teacher teach1 = new Teacher(1,"teach1","123","Student","1235","Marinel,nr.3",faculties,lectures);
		Teacher teach2 = new Teacher(2,"teach2","123","Student","1235","Marinel,nr.3",faculties,lectures);
		Teacher teach3 = new Teacher(3,"teach3","123","Student","1235","Marinel,nr.3",faculties,lectures);
		Teacher teach4 = new Teacher(4,"teach4","123","Student","1235","Marinel,nr.3",faculties,lectures);
		teachers.add(teach1);teachers.add(teach2);teachers.add(teach3);teachers.add(teach4);

	}
}
