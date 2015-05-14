package controller;

import java.util.ArrayList;


public interface IROController {
	public ArrayList<Object> getStudentLecturesById(int id);
	public ArrayList<Object> getTeacherLecturesById(int id);
	public String getNameById(int id);
	public String getSurnameById(int id);
	public String getGenderById(int id);
	public String getFathersNameById(int id);
	public ArrayList<Object> getStudentFacultiesById(int id);
}
