package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdminRepository implements IAdminRepo {
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Faculty> faculties = new ArrayList<Faculty>();
	private ArrayList<Lecture> lectures = new ArrayList<Lecture>();
	
	public AdminRepository(){
		populateTeachers();
		populateStudents();
		populateFaculties();
		populateLectures();
	}
	
	
	private void populateLectures() {
		// TODO Auto-generated method stub
		Lecture lect1 = new Lecture(1,"mate",8);
		Lecture lect2 = new Lecture(2,"info",8);
		Lecture lect3 = new Lecture(3,"romana",6);
		Lecture lect4 = new Lecture(4,"english",4);
		Lecture lect5 = new Lecture(5,"gym",2);
		Lecture lect6 = new Lecture(6,"oop",6);
		lectures.add(lect1);lectures.add(lect2);lectures.add(lect3);lectures.add(lect4);lectures.add(lect5);lectures.add(lect6);
		
	}
	private void populateFaculties() {
		// TODO Auto-generated method stub
		Faculty fac = new Faculty(1,"Babes-Bolyai","Campului,nr.2",lectures);
		Faculty fac2 = new Faculty(1,"UTC","Campului,nr.2",lectures);
		faculties.add(fac);faculties.add(fac2);
	}
	private void populateStudents() {
		// TODO Auto-generated method stub
		Map<String,Integer> grades = new HashMap<String,Integer>();
		grades.put("mate", 10);
		Student st1 = new Student(1,"st1","123","Student","1235","Marinel,nr.3",faculties,lectures,grades);
		
	}
	private void populateTeachers() {
		// TODO Auto-generated method stub
		Teacher teach = new Teacher(2,"teach1","123","Student","1235","Marinel,nr.3",faculties,lectures);
	}
	/**	
	 * login function logs a user in the application
	 * parameters: userName- the user name given by the admin
	 * 			   password - a string used as a verification mechanism

	 * returns true if the user exists
	 * 		   false otherwise
	 */
	public boolean login(String userName,String password){
		return true;
	}
	
	public void addStudent(Student student){}
	public void removeStudent(int studentId){}
	public void updateStudent(Student student){}
	public Student getStudentById(int studentId){
		return null;
	}
	
	public void addTeacher(Teacher teacher){}
	public void removeTeacher(int teacherId){}
	public void updateTeacher(Teacher teacher){}
	public Teacher getTeacherById(int teacherId){
		return null;
	}
	
	public void addLecture(Lecture lecture){}
	public void removeLecture(int lectureId){}
	public void updateLecture(Lecture lecture){}
	public Lecture getLectureById(int lectureId){
		return null;
	}
	
	public void addFaculty(Faculty faculty){}
	public void removeFaculty(int facultyId){}
	public void updateFaculty(Faculty faculty){}
	public Faculty getFacultyById(int facultyId){
		return null;
	}
}
