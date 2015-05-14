package model;

import java.util.ArrayList;

public class TeacherRepository implements ITeacherRepo{
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
	

	public Teacher getTeacherById(int teacherId){
		return null;
	}

	public ArrayList<Student> getAllStudents(){
		return null;
	}
	public ArrayList<Student> getAllStudentsForALectureByLectureId(int lectureId){
		return null;
	}

	public ArrayList<Lecture> getAllLectures(){
		return null;
	}
	public ArrayList<Lecture> getAllLecturesForATeacherByTeacherId(int teacherId){
		return null;
	}

	public ArrayList<Faculty> getAllFaculties(){
		return null;
	}
	public ArrayList<Faculty> getAllFacultiesForATeacherByTeacherId(int teacherId){
		return null;}

	public void addGrade(int grade,int studentId,int lectureId){

	}
	public void removeGrade(int studentId,int lectureId){

	}
	public void updateGrade(int newGade,int studentId,int lectureId){

	}

}
