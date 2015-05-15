package controller;

import java.util.ArrayList;

import model.Lecture;
import model.StudentRepository;
import model.TeacherRepository;

public class RWController implements IRWController{

	StudentRepository st; 
	TeacherRepository tr;
	
	public RWController() {
		this.st = new StudentRepository();
		this.tr = new TeacherRepository();
	}

	@Override
	public void addFaculty(int id, String name, String address,
			ArrayList<Lecture> lectures) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTeacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTeacherLecture() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void EnrollNewStudentLecture(int id, String name, int credits) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void addAdmin(String user, String password) {
		// TODO Auto-generated method stub
		
	}

}
