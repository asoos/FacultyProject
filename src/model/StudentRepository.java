package model;

import java.util.ArrayList;

public class StudentRepository extends PopulateRepository implements StudentRepoInterface {
	
	public StudentRepository(){
		populateLectures();
		populateFaculties();
		populateTeachers();
		populateStudents();
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
}
