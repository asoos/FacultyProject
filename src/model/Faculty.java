package model;

import java.util.ArrayList;

public class Faculty {
	private int _id;
	private String _name;
	private String _address;
	private ArrayList<Lecture> _lectures;
	
	public Faculty(int id, String name, String address,ArrayList<Lecture> lectures){
		this._id = id;
		this._name = name;
		this._address = address;
		this._lectures = lectures;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_address() {
		return _address;
	}

	public void set_address(String _address) {
		this._address = _address;
	}

	public ArrayList<Lecture> get_lectures() {
		return _lectures;
	}

	public void set_lectures(ArrayList<Lecture> _lectures) {
		this._lectures = _lectures;
	}

	@Override
	public String toString() {
		return "Faculty [_id=" + _id + ", _name=" + _name + ", _address="
				+ _address + ", _lectures=" + _lectures + "]";
	}
	
}
