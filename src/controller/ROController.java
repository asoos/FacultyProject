package controller;

import java.util.ArrayList;

import model.*;
public class ROController implements IROController {

	StudentRepository st; 
	TeacherRepository tr;
	
	public ROController() {
		// TODO Auto-generated constructor stub
		this.st = new StudentRepository();
		this.tr = new TeacherRepository();
	}

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
		else if (UserSingleton.type == 1) {
			return tr.getTeacherById(UserSingleton.id).get_name();
		}
		return null;
	}

	@Override
	public String getSurnameById(int id) {
		// TODO Auto-generated method stub
		if (UserSingleton.type == 0){
			return st.getStudentById(UserSingleton.id).get_surName();
		}
		else if (UserSingleton.type == 1) {
			return tr.getTeacherById(UserSingleton.id).get_surName();
		}
		return null;
	}

	@Override
	public String getGenderById(int id) {
		if (UserSingleton.type == 0){
			return st.getStudentById(UserSingleton.id).get_gender();
		}
		else if (UserSingleton.type == 1) {
			return tr.getTeacherById(UserSingleton.id).get_gender();
		}
		return null;
	}

	@Override
	public String getFathersNameById(int id) {
		// TODO Auto-generated method stub
		if (UserSingleton.type == 0){
			return st.getStudentById(UserSingleton.id).get_fatherName();
		}
		else if (UserSingleton.type == 1) {
			return tr.getTeacherById(UserSingleton.id).get_fatherName();
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
	public ArrayList <Object> getTeacherFacultiesById(int id) {
		Teacher current = tr.getTeacherById(UserSingleton.id);
		ArrayList<Object> res = new ArrayList<Object>();
		for (Faculty f : current.get_faculties()){
			res.add(f);
		}
		return res;
	}
	

}
