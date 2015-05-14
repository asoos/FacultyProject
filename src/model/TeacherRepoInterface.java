package model;

import java.util.ArrayList;

public interface TeacherRepoInterface {
	/**
	 	 * login function logs a user in the application
	 * parameters: userName- the user name given by the admin
	 * 			   password - a string used as a verification mechanism
	 */
	public boolean login(String userName,String password);
	
	public Teacher getTeacherById(int teacherId);
	public ArrayList<Teacher> getAllTeacher();
	
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
