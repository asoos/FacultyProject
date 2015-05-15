package controller;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class LoginController implements ILoginController{

	private AdminRepoInterface adminRepo;
	private TeacherRepoInterface teacherRepo;
	private StudentRepoInterface studentRepo;
	
	public LoginController(){
		adminRepo = new AdminRepository();
		teacherRepo = new TeacherRepository();
		studentRepo = new StudentRepository();
	}
	
	@Override
	public int login(String username, String password, int type) {
		
		int id = -1;
		if (type == 0){
			//student
			id = validStudent(username, password);
			System.out.println(id);
			if (id != -1) {
				//we fould the student
				updateSingleton(id,type,username,password);
			}
			
		} else if (type == 1) {
			//teacher
			id = validTeacher(username, password);
			if (id != -1) {
				//we fould Teacher
				updateSingleton(id, type, username, password);
			}
			
		} else if (type == 2){
			//admin
			id = validAdmin(username, password);
			if (id != -1) {
				//we fould Admin
				updateSingleton(id, type, username, password);
			}
		}
		return id;
	}

	private void updateSingleton(int id, int type, String username,
			String password) {
		// TODO Auto-generated method stub
			UserSingleton.id = id;
			UserSingleton.password = password;
			UserSingleton.username = username;
			UserSingleton.type = type;
	}

	private int validAdmin(String username, String password) {
		// return -1 if the admin is not foud. Else, returns his id
		List<Admin> admins = adminRepo.getAllAdmins();
		for (Admin curr : admins) {
			if (curr.get_password() == password && curr.get_userName() == username) {
				return curr.get_id();
			}
		}
		return -1;
	}

	private int validTeacher(String username, String password) {
		//return -1 if the Teacher does not exists
		ArrayList<Teacher> teachers = teacherRepo.getAllTeachers();
		for (Teacher currentTeacher : teachers) {
			if (currentTeacher.get_password() == password && currentTeacher.get_userName() == username){
				return currentTeacher.get_userId();
			}
		}
		return -1;
	}
	
	private int validStudent(String username, String password) {
		//return -1 if the student does not exist. Else, returns his id
		ArrayList<Student> students = studentRepo.getAllStudents();
		for (Student currentStudent : students) {
			System.out.println(currentStudent);
			if (currentStudent.getPassword().equals(password)  
					&& currentStudent.get_userName().equals(username)){
				return currentStudent.get_userId();
			}
		}
		return -1;
	}
	
	
	@Override
	public int register(String username, String password, int type) {
		
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
