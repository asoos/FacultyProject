package controller;

public class UserSingleton {

	public static UserSingleton instance;
	
	public static int id;
	public static String username;
	public static String password;
	public static int type;
	
	protected UserSingleton() {
		   // Exists only to defeat instantiation.
		}
		public static UserSingleton getInstance() {
		   if(instance == null) {
		      instance = new UserSingleton();
		   }
		   return instance;
		}
		
		public String toString(){
			String s = "";
			s += "id:"+id;
			s += "username:"+username+"\npassword:"+password+"\ntype:"+type;
			
			return s;
		}
}
