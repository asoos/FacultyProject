package model;

import java.util.ArrayList;
import java.util.Map;

public class Student extends User{
	private int _userId;
	private String _name;
	private String _cnp;
	private String _address;
	private ArrayList<Faculty> _faculties;
	private ArrayList<Lecture> _lectures;
	private Map<String,Integer> _grades;
	
	public Student(int id,String userName,String password,
					String name,String cnp,String address,ArrayList<Faculty> faculties,ArrayList<Lecture>lectures,Map<String,Integer> grades){
		super(id,userName,password);
		this._userId = id;
		this._name = name;
		this._cnp = cnp;
		this._address = address;
		this._faculties = faculties;
		this._lectures = lectures;
		this._grades = grades;
	}

	public int get_userId() {
		return _userId;
	}

	public void set_userId(int _userId) {
		this._userId = _userId;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_cnp() {
		return _cnp;
	}

	public void set_cnp(String _cnp) {
		this._cnp = _cnp;
	}

	public String get_address() {
		return _address;
	}

	public void set_address(String _address) {
		this._address = _address;
	}

	public ArrayList<Faculty> get_faculties() {
		return _faculties;
	}

	public void set_faculties(ArrayList<Faculty> _faculties) {
		this._faculties = _faculties;
	}

	public ArrayList<Lecture> get_lectures() {
		return _lectures;
	}

	public Map<String, Integer> get_grades() {
		return _grades;
	}

	public void set_grades(Map<String, Integer> _grades) {
		this._grades = _grades;
	}

	public void set_lectures(ArrayList<Lecture> _lectures) {
		this._lectures = _lectures;
	}

	@Override
	public String toString() {
		return "Student [_userId=" + _userId + ", _name=" + _name + ", _cnp="
				+ _cnp + ", _address=" + _address + ", _faculties="
				+ _faculties + ", _lectures=" + _lectures + ", _grades="
				+ _grades + "]";
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return super.get_password();
		
	}


	
}
