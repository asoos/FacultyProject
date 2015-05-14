package model;

import java.util.ArrayList;

public interface ITeacherRepo {
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
	
	public Teacher getTeacherById(int teacherId);
	
	public ArrayList<Student> getAllStudents();
	public ArrayList<Student> getAllStudentsForALectureByLectureId(int lectureId);
	
	public ArrayList<Lecture> getAllLectures();
	public ArrayList<Lecture> getAllLecturesForATeacherByTeacherId(int teacherId);
	
	public ArrayList<Faculty> getAllFaculties();
	public ArrayList<Faculty> getAllFacultiesForATeacherByTeacherId(int teacherId);
	
	public void addGrade(int grade,int studentId,int lectureId);
	public void removeGrade(int studentId,int lectureId);
	public void updateGrade(int newGade,int studentId,int lectureId);
	
}
