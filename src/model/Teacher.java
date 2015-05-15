package model;

import java.util.ArrayList;
import java.util.Map;

public class Teacher extends User{
	private int _userId;
	private String _firstName;
	private String _surName;
	private String _fatherName;
	private String _gender;
	private String _cnp;
	private String _address;
	private ArrayList<Faculty> _faculties;
	private ArrayList<Lecture> _lectures;
	
	public Teacher(int id,String userName,String password,
					String name,String cnp,String address,ArrayList<Faculty> faculties,ArrayList<Lecture>lectures){
		super(id,userName,password);
		this._userId = id;
		this._firstName = name;
		this._cnp = cnp;
		this._address = address;
		this._faculties = faculties;
		this._lectures = lectures;
	}
	public Teacher(int id,String userName,String password,
			String firstName,String surName,String fatherName,String gender,String cnp,String address,ArrayList<Faculty> faculties,ArrayList<Lecture>lectures,Map<String,Integer> grades){
		super(id,userName,password);
		this._userId = id;
		this._firstName = firstName;
		this._surName = surName;
		this._fatherName = fatherName;
		this._gender = gender;
		this._cnp = cnp;
		this._address = address;
		this._faculties = faculties;
		this._lectures = lectures;
}

	@Override
	public String toString() {
		return "Teacher [_userId=" + _userId + ", _firstName=" + _firstName
				+ ", _surName=" + _surName + ", _fatherName=" + _fatherName
				+ ", _gender=" + _gender + ", _cnp=" + _cnp + ", _address="
				+ _address + ", _faculties=" + _faculties + ", _lectures="
				+ _lectures + "]";
	}

	public String get_firstName() {
		return _firstName;
	}
	public void set_firstName(String _firstName) {
		this._firstName = _firstName;
	}
	public String get_surName() {
		return _surName;
	}
	public void set_surName(String _surName) {
		this._surName = _surName;
	}
	public String get_gender() {
		return _gender;
	}
	public void set_gender(String _gender) {
		this._gender = _gender;
	}
	public int get_userId() {
		return _userId;
	}

	public void set_userId(int _userId) {
		this._userId = _userId;
	}

	public String get_fatherName() {
		return _fatherName;
	}
	public void set_fatherName(String _fatherName) {
		this._fatherName = _fatherName;
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

	public void set_lectures(ArrayList<Lecture> _lectures) {
		this._lectures = _lectures;
	}


	
}
