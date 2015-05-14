package controller;

public class LoginController implements ILoginController{

	
	
	@Override
	public int login(String username, String password, int type) {
		// TODO Auto-generated method stub
		if (type == 0){
			//student
		} else if (type == 1) {
			//teacher
		} else if (type == 2){
			//admin
		}
		return 0;
	}

	@Override
	public int register(String username, String password, int type) {
		// TODO Auto-generated method stub
		if (type == 0){
			//student
		} else if (type == 1) {
			//teacher
		} else if (type == 2){
			//admin
		}
		return 0;
	}
	
	
}
