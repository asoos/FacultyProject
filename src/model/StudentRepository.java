package model;

import java.util.ArrayList;

public class StudentRepository implements IStudentRepo {
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
	
	public Student getStudentById(int studentId){
		return null;
	}
	
	public ArrayList<Student> getAllStudents(){
		return null;
	}
	
	public ArrayList<Lecture> getAllLectures(){
		return null;
	}	
	public ArrayList<Lecture> getAllLecturesForAStudentByStudentId(int studentId){
		return null;
	}
	
	public ArrayList<Faculty> getAllFaculties(){
		return null;
	}
	public ArrayList<Faculty> getAllFacultiesForAStudentByStudentId(int studentId){
		return null;
	}
	
	public void enrollToLecture(int studentId,int lectureId){
		
	}
}
