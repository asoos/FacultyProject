package model;

public interface IAdminRepo {
	/**
	
	 * login function logs a user in the application
	 * parameters: userName- the user name given by the admin
	 * 			   password - a string used as a verification mechanism
	 */
	public boolean login(String userName,String password);
	
	public void addStudent(Student student);
	public void removeStudent(int studentId);
	public void updateStudent(Student student);
	public Student getStudentById(int studentId);
	
	public void addTeacher(Teacher teacher);
	public void removeTeacher(int teacherId);
	public void updateTeacher(Teacher teacher);
	public Teacher getTeacherById(int teacherId);
	
	public void addLecture(Lecture lecture);
	public void removeLecture(int lectureId);
	public void updateLecture(Lecture lecture);
	public Lecture getLectureById(int lectureId);
	
	public void addFaculty(Faculty faculty);
	public void removeFaculty(int facultyId);
	public void updateFaculty(Faculty faculty);
	public Faculty getFacultyById(int facultyId);
	

}
