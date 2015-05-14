package model;

import java.util.ArrayList;


public interface IStudentRepo {
	/**
	 * login function logs a user in the application
	 * parameters: userName- the user name given by the admin
	 * 			   password - a string used as a verification mechanism
	 */
	public boolean login(String userName,String password);
	
	public Student getStudentById(int studentId);
	
	public ArrayList<Student> getAllStudents();
	
	public ArrayList<Lecture> getAllLectures();	
	public ArrayList<Lecture> getAllLecturesForAStudentByStudentId(int studentId);
	
	public ArrayList<Faculty> getAllFaculties();
	public ArrayList<Faculty> getAllFacultiesForAStudentByStudentId(int studentId);
	
	public void enrollToLecture(int studentId,int lectureId);
}
