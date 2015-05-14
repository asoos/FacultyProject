package model;

public class User {
	private int _id;
	private String _userName;
	private String _password;
	
	public User(int id, String userName,String password){
		this._id = id;
		this._userName = userName;
		this._password = password;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_userName() {
		return _userName;
	}

	public void set_userName(String _userName) {
		this._userName = _userName;
	}

	public String get_password() {
		return _password;
	}

	public void set_password(String _password) {
		this._password = _password;
	}

	@Override
	public String toString() {
		return "User [_id=" + _id + ", _userName=" + _userName + ", _password="
				+ _password + "]";
	}
	
}
