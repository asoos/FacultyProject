package controller;

import java.util.List;

import model.Lecture;


public interface IROController {
	public List<Lecture> getStudentLecturesById(int id);
	public List<Lecture> getTeacherLecturesById(int id);
	public String getNameById(int id);
	public String getSurnameById(int id);
	public String getGenderById(int id);
	public String getFathersNameById(int id);
	public String getFacultiesById(int id);
}
