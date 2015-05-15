package model;

import java.util.ArrayList;

public class TeacherRepository extends PopulateRepository implements TeacherRepoInterface{
	public static ArrayList<Teacher> teachers = new ArrayList<Teacher>();

	
	public TeacherRepository(){
		populateLectures();
		populateFaculties();
		populateTeachers();
		populateStudents();
		populateAdmins();
	}

	private void populateTeachers() {
		// TODO Auto-generated method stub
		Teacher teach1 = new Teacher(1,"mate","123","Student","1235","Marinel,nr.3",faculties,lectures);
		Teacher teach2 = new Teacher(2,"teach2","123","Student","1235","Marinel,nr.3",faculties,lectures);
		Teacher teach3 = new Teacher(3,"teach3","123","Student","1235","Marinel,nr.3",faculties,lectures);
		Teacher teach4 = new Teacher(4,"teach4","123","Student","1235","Marinel,nr.3",faculties,lectures);
		teachers.add(teach1);teachers.add(teach2);teachers.add(teach3);teachers.add(teach4);	
	}

	public boolean login(String userName,String password){
		for(Teacher teacher:teachers){
			if(teacher.get_userName().equals(userName) && teacher.get_password().equals(password))
				return true;
		}
		return false;
	}
	

	public Teacher getTeacherById(int teacherId){
		for(Teacher teacher:teachers)
			if(teacher.get_id() == teacherId)
				return teacher;
		return null;
	}

	public ArrayList<Student> getAllStudents(){
		return students;
	}
	public ArrayList<Student> getAllStudentsForALectureByLectureId(int lectureId){
		ArrayList<Student> studentsToReturn = null;
		boolean studentCanBeAdded = false;
		for(Student student:students){
			for(Lecture lecture:student.get_lectures())
				if(lecture.get_id() == lectureId){
					studentCanBeAdded = true;
				}
			if(studentCanBeAdded == true)
				studentsToReturn.add(student);
		}
		return studentsToReturn;
	}

	public ArrayList<Lecture> getAllLectures(){
		return lectures;
	}
	public ArrayList<Lecture> getAllLecturesForATeacherByTeacherId(int teacherId){
		for(Teacher teacher: teachers)
			if(teacher.get_id() == teacherId)
				return teacher.get_lectures();
		return null;
	}

	public ArrayList<Faculty> getAllFaculties(){
		return faculties;
	}
	public ArrayList<Faculty> getAllFacultiesForATeacherByTeacherId(int teacherId){
		for(Teacher teacher: teachers)
			if(teacher.get_id() == teacherId)
				return teacher.get_faculties();
		return null;
	}

	public void addGrade(int grade,int studentId,int lectureId){
		for (Student student:students)
			if(student.get_id() == studentId)
				for(Lecture lecture:student.get_lectures()){
					if(lecture.get_id() == lectureId){
						student.get_grades().remove(lecture.get_name());
						student.get_grades().put(lecture.get_name(), grade);
					}
					
				}
	}
	public void removeGrade(int studentId,int lectureId){
		for (Student student:students)
			if(student.get_id() == studentId)
				for(Lecture lecture:student.get_lectures()){
					if(lecture.get_id() == lectureId){
						student.get_grades().remove(lecture.get_name());
					}
					
				}
	}
	public void updateGrade(int newGrade,int studentId,int lectureId){
		for (Student student:students)
			if(student.get_id() == studentId)
				for(Lecture lecture:student.get_lectures()){
					if(lecture.get_id() == lectureId){
						student.get_grades().remove(lecture.get_name());
						student.get_grades().put(lecture.get_name(), newGrade);
					}
					
				}
	}
	@Override
	public ArrayList<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return teachers;
	}
	@Override
	public ArrayList<Lecture> getAllLecturesForWhichATecherIsNotEnrolled(
			int teacherId) {
		// TODO Auto-generated method stub
		ArrayList<Lecture> lecturesToReturn = null;
		
		for(Teacher teacher:teachers){
			if(teacher.get_id() == teacherId)
				for(Lecture lecture:lectures)
					if(teacher.get_lectures().contains(lecture) == false){
						lecturesToReturn.add(lecture);
				}
		
		}
		return lecturesToReturn;		
	}
	public void enrollToLecture(int teacherId,int lectureId){
		Lecture lecture= null;
		int index=0;
		for(Lecture lect:lectures){
			if(lect.get_id() == lectureId)
				lecture = lect;
		}
		for(Teacher teacher:teachers)
			if(teacher.get_id() == teacherId)
				teachers.get(index).get_lectures().add(lecture);
	}

}
