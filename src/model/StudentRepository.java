package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentRepository extends PopulateRepository implements StudentRepoInterface {
	public ArrayList<Student> students = new ArrayList<Student>();
	
	public StudentRepository(){
		populateLectures();
		populateFaculties();
		populateTeachers();
//		students = populateStudents();
		populateAdmins();	
	}
	/**	
	 * login function logs a user in the application
	 * parameters: userName- the user name given by the admin
	 * 			   password - a string used as a verification mechanism

	 * returns true if the user exists
	 * 		   false otherwise
	 */
	public boolean login(String userName,String password){
		for(Student student:students){
			if(student.get_userName().equals(userName) && student.get_password().equals(password))
				return true;
		}
		return false;
	}
	
	public Student getStudentById(int studentId){
		for(Student student:students)
			if(student.get_id() == studentId)
				return student;
		return null;
	}
	
	public ArrayList<Student> getAllStudents(){
		Map<String,Integer> grades = new HashMap<String,Integer>();
		grades.put("mate", 10);
		Student st1 = new Student(1,"mate","123","Student1","1235","Marinel,nr.3",faculties,lectures,grades);
		grades.put("English", 9);
		Student st2 = new Student(2,"st2","123","Student2","1235","Marinel,nr.3",faculties,lectures,grades);
		grades.put("oop", 10);
		Student st3 = new Student(3,"st3","123","Student3","1235","Marinel,nr.3",faculties,lectures,grades);
		students.add(st1);students.add(st2);students.add(st3);
		students.toString();
		return students;
	}
	
	public ArrayList<Lecture> getAllLectures(){
		return lectures;
	}	
	public ArrayList<Lecture> getAllLecturesForAStudentByStudentId(int studentId){
		for(Student student:students)
			if(student.get_id() == studentId)
				return student.get_lectures();
		return null;
	}
	
	public ArrayList<Faculty> getAllFaculties(){
		return faculties;
	}
	public ArrayList<Faculty> getAllFacultiesForAStudentByStudentId(int studentId){
		for(Student student:students)
			if(student.get_id() == studentId)
				return student.get_faculties();
		return null;
	}
	
	public void enrollToLecture(int studentId,int lectureId){
		Lecture lecture= null;
		int index=0;
		for(Lecture lect:lectures){
			if(lect.get_id() == lectureId)
				lecture = lect;
		}
		for(Student student:students)
			if(student.get_id() == studentId)
				students.get(index).get_lectures().add(lecture);
	}
	@Override
	public ArrayList<Lecture> getAllLecturesToWhichAStudentIsNotEnrolled(
			int studentId) {
		// TODO Auto-generated method stub
			ArrayList<Lecture> lecturesToReturn = null;
			
			for(Student student:students){
				if(student.get_id() == studentId)
					for(Lecture lecture:lectures)
						if(student.get_lectures().contains(lecture) == false){
							lecturesToReturn.add(lecture);
					}
			
			}
			return lecturesToReturn;		
	}
}
