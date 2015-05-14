package controller;

import java.util.ArrayList;

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
		int id = -1;
		if (type == 0){
			//student
			id = validStudent(username, password);
			if (id != -1) {
				//we fould the student
				UserSingleton.id = id;
				UserSingleton.password = password;
				UserSingleton.username = username;
				UserSingleton.type = type;
			}
			
			
		} else if (type == 1) {
			//teacher
			id = validTeacher(username, password);
			if (id != -1) {
				//we fould Teacher
				UserSingleton.id = id;
				UserSingleton.password = password;
				UserSingleton.username = username;
				UserSingleton.type = type;
			}
			
		} else if (type == 2){
			//admin
//			id = validAdmin(username, password);
//			if (id != -1) {
//				//we fould Admin
//				UserSingleton.id = id;
//				UserSingleton.password = password;
//				UserSingleton.username = username;
//				UserSingleton.type = type;
//			}
		}
		return id;
	}

	private int validTeacher(String username, String password) {
		//return -1 if the Teacher does not exists
		//ArrayList<Teacher> teachers = teacherRepo.get();
		//for (Student currentStudent : teachers) {
			//if (currentStudent.getPassword() == password && currentStudent.get_userName() == username){
				//return currentStudent.get_userId();
			//}
		//}
		return -1;
	}
	private int validStudent(String username, String password) {
		//return -1 if the student does not exist. Else, returns his id
		ArrayList<Student> students = studentRepo.getAllStudents();
		for (Student currentStudent : students) {
			if (currentStudent.getPassword() == password && currentStudent.get_userName() == username){
				return currentStudent.get_userId();
			}
		}
		return -1;
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
