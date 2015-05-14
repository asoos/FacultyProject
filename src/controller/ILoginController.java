package controller;

public interface ILoginController {
	int	login(String username, String password, int  type);
	int register(String username, String password, int type);

}
