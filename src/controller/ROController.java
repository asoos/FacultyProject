package controller;

import java.util.ArrayList;

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
		
		if (UserSingleton.type == 0){
			return st.getStudentById(UserSingleton.id).get_name();
		}
		return null;
	}

	@Override
	public String getSurnameById(int id) {
		// TODO Auto-generated method stub
		if (UserSingleton.type == 0){
			return "Default Student Surname";
		}
		return null;
	}

	@Override
	public String getGenderById(int id) {
		// TODO Auto-generated method stub
		if (UserSingleton.type == 0){
			return "Default Student Gender";
		}
		return null;
	}

	@Override
	public String getFathersNameById(int id) {
		// TODO Auto-generated method stub
		if (UserSingleton.type == 0){
			return "Default Student father's name";
		}
		return null;
	}

	@Override
	public ArrayList <Object> getStudentFacultiesById(int id) {
		Student current = st.getStudentById(UserSingleton.id);
		ArrayList<Object> res = new ArrayList<Object>();
		for (Faculty f : current.get_faculties()){
			res.add(f);
		}
		return res;
	}
	

}
