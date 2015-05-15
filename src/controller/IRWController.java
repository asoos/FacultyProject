package controller;

import java.util.ArrayList;

import model.Lecture;

public interface IRWController {
	
	public void addTeacher();
	
	public void addTeacherLecture();
	
	public void EnrollNewStudentLecture(int id, String name, int credits);
	
	public void addAdmin(String user, String password);
	
	public void addFaculty(int id, String name, String address,ArrayList<Lecture> lectures);
}

