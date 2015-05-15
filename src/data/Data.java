package data;

import java.io.Serializable;
//import java.lang.Object.toString;

public class Data implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String Name;
	public String Surname;
	public String FatherName;
	public String Gender;
	public int id;
	
	
	
	public Data(String name, String surname, String fatherName, String gender,
			int id) {
		super();
		Name = name;
		Surname = surname;
		FatherName = fatherName;
		Gender = gender;
		this.id = id;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public void setSurname(String Surname){
		this.Surname = Surname;
	}
	public void setFatherName(String FatherName){
		this.FatherName = FatherName;
	}
	public void setGender(String Gender){
		this.Gender = Gender;
	}
	public void setid(int id){
		this.id = id;
	}
	
	public String getName(){
		return this.Name;
	}
	
	public String getSurname(){
		return this.Surname;
	}
	
	public String getFatherName(){
		return this.FatherName;
	}
	
	public String getGender(){
		return this.Gender;
	}
	public Integer getid(){
		return this.id;
	}
	public String toString() {
        // TODO Auto-generated method stub
        String value = "Name : " + Name + "\nSurname : " + Surname
                + "\nFatherName : " + FatherName + "\nGender : " +Gender + "\nid" + id;
        return value;
    }
}
