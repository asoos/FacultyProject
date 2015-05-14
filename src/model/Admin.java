package model;

public class Admin extends User{
	private String _name;
	
	public Admin(int id,String userName,String password,String name){
		super(id,userName,password);
		this._name = name;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	@Override
	public String toString() {
		return "Admin [_name=" + _name + "]";
	}
	
}
