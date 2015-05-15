package model;

public class Admin extends User{
	private String _firstName;
	private String _surName;
	private String _fatherName;
	private String _gender;
	
	public Admin(int id,String userName,String password,String name){
		super(id,userName,password);
		this._firstName = name;
	}

	public String get_name() {
		return _firstName;
	}

	public void set_name(String _name) {
		this._firstName = _name;
	}

	public String get_surName() {
		return _surName;
	}

	public void set_surName(String _surName) {
		this._surName = _surName;
	}

	public String get_fatherName() {
		return _fatherName;
	}

	public void set_fatherName(String _fatherName) {
		this._fatherName = _fatherName;
	}

	public String get_gender() {
		return _gender;
	}

	public void set_gender(String _gender) {
		this._gender = _gender;
	}

	@Override
	public String toString() {
		return "Admin [_firstName=" + _firstName + ", _surName=" + _surName
				+ ", _fatherName=" + _fatherName + ", _gender=" + _gender + "]";
	}

	
}
