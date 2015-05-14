package controller;

import model.*;

public class LoginController implements ILoginController{

	private IAdminRepo adminRepo;
	private ITeacherRepo teacherRepo;
	private IStudentRepo studentRepo;
	
	public LoginController(){
		adminRepo = new AdminRepository();
		teacherRepo = new TeacherRepository();
		studentRepo = new StudentRepository();
	}
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
