package controller;

import java.util.ArrayList;
import java.util.List;

import model.*;
public class ROController implements IROController {

	
	StudentRepository st = new StudentRepository();
	TeacherRepository tr = new TeacherRepository();
	@Override
	public ArrayList<Object> getStudentLecturesById(int id) {
		// TODO Auto-generated method stub
		
		Student current = st.getStudentById(UserSingleton.id);
		ArrayList<Object> res = new ArrayList<Object>();
		for (Lecture l : current.get_lectures()){
			res.add(l);
		}
		return res;
	}

	@Override
	public  ArrayList <Object> getTeacherLecturesById(int id) {
		// TODO Auto-generated method stub
		Teacher current = tr.getTeacherById(UserSingleton.id);
		ArrayList<Object> res = new ArrayList<Object>();
		for (Lecture l : current.get_lectures()){
			res.add(l);
		}
		return res;
	}

	@Override
	public String getNameById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSurnameById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGenderById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFathersNameById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList <Object> getFacultiesById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
