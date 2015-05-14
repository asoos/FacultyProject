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
}
