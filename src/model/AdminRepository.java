package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class AdminRepository extends PopulateRepository implements AdminRepoInterface {

	
	public AdminRepository(){
		populateLectures();
		populateFaculties();
		populateTeachers();
		populateStudents();

		populateAdmins();	

	}
	
	
	public void populateLectures() {
		// TODO Auto-generated method stub
		Lecture lect1 = new Lecture(1,"mate",8);
		Lecture lect2 = new Lecture(2,"info",8);
		Lecture lect3 = new Lecture(3,"romana",6);
		Lecture lect4 = new Lecture(4,"english",4);
		Lecture lect5 = new Lecture(5,"gym",2);
		Lecture lect6 = new Lecture(6,"oop",6);
		lectures.add(lect1);lectures.add(lect2);lectures.add(lect3);lectures.add(lect4);lectures.add(lect5);lectures.add(lect6);
		
	}
	public void populateFaculties() {
		// TODO Auto-generated method stub
		Faculty fac = new Faculty(1,"Babes-Bolyai","Campului,nr.2",lectures);
		Faculty fac2 = new Faculty(1,"UTC","Campului,nr.2",lectures);
		faculties.add(fac);faculties.add(fac2);
	}
	public void populateStudents() {
		// TODO Auto-generated method stub
		Map<String,Integer> grades = new HashMap<String,Integer>();
		grades.put("mate", 10);
		Student st1 = new Student(1,"st1","123","Student1","1235","Marinel,nr.3",faculties,lectures,grades);
		grades.remove("mate");
		grades.put("info", 10);
		Student st2 = new Student(2,"st2","123","Student2","1235","Marinel,nr.3",faculties,lectures,grades);
		grades.remove("info");
		grades.put("oop", 7);
		Student st3 = new Student(3,"st3","123","Student3","1235","Marinel,nr.3",faculties,lectures,grades);
		grades.remove("oop");
		grades.put("info", 10);
		Student st4 = new Student(4,"st4","123","Student4","1235","Marinel,nr.3",faculties,lectures,grades);

		students.add(st1);students.add(st2);students.add(st3);students.add(st4);
		
	}
	public void populateTeachers() {
		// TODO Auto-generated method stub
		Teacher teach1 = new Teacher(1,"teach1","123","Teacher1","1235","Marinel,nr.3",faculties,lectures);
		Teacher teach2 = new Teacher(2,"teach2","123","Teacher2","1235","Marinel,nr.3",faculties,lectures);
		Teacher teach3 = new Teacher(3,"teach3","123","Teacher3","1235","Marinel,nr.3",faculties,lectures);
		Teacher teach4 = new Teacher(4,"teach4","123","Teacher4","1235","Marinel,nr.3",faculties,lectures);
		
		teachers.add(teach1);teachers.add(teach2);teachers.add(teach3);teachers.add(teach4);
	}

	/**	
	 * login function logs a user in the application
	 * parameters: userName- the user name given by the admin
	 * 			   password - a string used as a verification mechanism

	 * returns true if the user exists
	 * 		   false otherwise
	 */
	public boolean login(String userName,String password){
		for(Admin user:admins){
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
