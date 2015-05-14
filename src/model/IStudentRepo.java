package model;

import java.util.ArrayList;


public interface IStudentRepo {
	/**
	 * login function logs a user in the application
	 * parameters: userName- the user name given by the admin
	 * 			   password - a string used as a verification mechanism
	 * 			   position - an integer which indicates what kind of user tries to log in
	 * 						1 - is for an admin
	 * 						2 - is for a teacher
	 * 						3 - is for a student
	 */
	public void login(String userName,String password,int position);
	
	public Student getStudentById(int studentId);
	
	public ArrayList<Student> getAllStudents();
	
	public ArrayList<Lecture> getAllLectures();	
	public ArrayList<Lecture> getAllLecturesForAStudentByStudentId(int studentId);
	
	public ArrayList<Faculty> getAllFaculties();
	public ArrayList<Faculty> getAllFacultiesForAStudentByStudentId(int studentId);
	
	public void enrollToLecture(int studentId,int lectureId);
}
