package controller;

import java.util.ArrayList;

import model.Lecture;

public interface IRWController {
	public void addTeacherCourseById(int id);
	
	public void addStudentCourseById(int id);
	
	public void addUser(String user, String password, int type);
	
	public void addFaculty(int id, String name, String address,ArrayList<Lecture> lectures);
}

