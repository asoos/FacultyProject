package model;

public class Lecture {
	private int _id;
	private String _name;
	private int _credits;
	
	public Lecture(int id,String name,int credits){
		this._id = id;
		this._name = name;
		this._credits = credits;
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

	public int get_credits() {
		return _credits;
	}

	public void set_credits(int _credits) {
		this._credits = _credits;
	}

	@Override
	public String toString() {
		return "Lecture [_id=" + _id + ", _name=" + _name + ", _credits="
				+ _credits + "]";
	}
	

}
