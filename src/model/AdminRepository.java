package model;

import java.util.ArrayList;


public class AdminRepository extends PopulateRepository implements AdminRepoInterface {

	
	public AdminRepository(){
		populateLectures();
		populateFaculties();
		populateTeachers();
		populateStudents();
		populateAdmins();	
	}

	/**	
	 * login function logs a user in the application
	 * parameters: userName- the user name given by the admin
	 * 			   password - a string used as a verification mechanism

	 * returns true if the user exists
	 * 		   false otherwise
	 */
	public boolean login(String userName,String password){
		for(User user:admins){
			if(user.get_userName().equals(userName) && user.get_password().equals(password))
				return true;
		}
		return false;
	}
	
	public void addStudent(Student student){
		students.add(student);
	}
	public void removeStudent(int studentId){
		ArrayList<Student> temporaryStudents;
		temporaryStudents = students;
		for(Student student:temporaryStudents)
			if(student.get_id() == studentId){
				students.remove(student);
			}				
	}
	public void updateStudent(Student student){
		ArrayList<Student> temporaryStudents;
		temporaryStudents = students;
		int index = 0;
		for(Student st:temporaryStudents){
			index++;
			if(st.get_id() == student.get_id()){
				students.get(index).set_name(st.get_name());
				students.get(index).set_cnp(st.get_cnp());
				students.get(index).set_address(st.get_address());
				students.get(index).set_faculties(st.get_faculties());
				students.get(index).set_lectures(st.get_lectures());
				students.get(index).set_grades(st.get_grades());
			}				
		}
	}
	public Student getStudentById(int studentId){
		for(Student student:students){
			if(student.get_id() == studentId)
				return student;
		}
		return null;
	}
	
	public void addTeacher(Teacher teacher){
		teachers.add(teacher);
	}
	public void removeTeacher(int teacherId){
		ArrayList<Teacher> temporaryTeachers;
		temporaryTeachers = teachers;
		for(Teacher teacher:temporaryTeachers)
			if(teacher.get_id() == teacherId){
				students.remove(teacher);
			}
	}
	public void updateTeacher(Teacher teacher){
		ArrayList<Teacher> temporaryTeachers;
		temporaryTeachers = teachers;
		int index = 0;
		for(Teacher teach:temporaryTeachers){
			index++;
			if(teach.get_id() == teacher.get_id()){
				teachers.get(index).set_name(teach.get_name());
				teachers.get(index).set_cnp(teach.get_cnp());
				teachers.get(index).set_address(teach.get_address());
				teachers.get(index).set_faculties(teach.get_faculties());
				teachers.get(index).set_lectures(teach.get_lectures());
			}				
		}
	}
	public Teacher getTeacherById(int teacherId){
		for(Teacher teacher:teachers){
			if(teacher.get_id() == teacherId)
				return teacher;
		}
		return null;
	}
	
	public void addLecture(Lecture lecture){
		lectures.add(lecture);
	}
	public void removeLecture(int lectureId){
		ArrayList<Lecture> temporaryLectures;
		temporaryLectures = lectures;
		for(Lecture lecture:temporaryLectures)
			if(lecture.get_id() == lectureId){
				students.remove(lecture);
			}
	}
	public void updateLecture(Lecture lecture){
		ArrayList<Lecture> temporaryLectures;
		temporaryLectures = lectures;
		int index = 0;
		for(Lecture lec:temporaryLectures){
			index++;
			if(lec.get_id() == lecture.get_id()){
				lectures.get(index).set_name(lecture.get_name());
				lectures.get(index).set_credits(lecture.get_credits());
				
			}				
		}
	}
	public Lecture getLectureById(int lectureId){
		for(Lecture lecture:lectures){
			if(lecture.get_id() == lectureId)
				return lecture;
		}
		return null;
	}
	
	public void addFaculty(Faculty faculty){
		faculties.add(faculty);
	}
	public void removeFaculty(int facultyId){
		ArrayList<Faculty> temporaryFaculties;
		temporaryFaculties = faculties;
		for(Faculty faculty:temporaryFaculties)
			if(faculty.get_id() == facultyId){
				faculties.remove(faculty);
			}
	}
	public void updateFaculty(Faculty faculty){
		ArrayList<Faculty> temporaryFaculties;
		temporaryFaculties = faculties;
		int index = 0;
		for(Faculty fac:temporaryFaculties){
			index++;
			if(fac.get_id() == faculty.get_id()){
				faculties.get(index).set_name(faculty.get_name());
				faculties.get(index).set_address(faculty.get_address());
				faculties.get(index).set_lectures(faculty.get_lectures());
			}				
		}
	}
	public Faculty getFacultyById(int facultyId){
		for(Faculty faculty:faculties){
			if(faculty.get_id() == facultyId)
				return faculty;
		}
		return null;
	}

	@Override
	public ArrayList<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return admins;
	}
}
