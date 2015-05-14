package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.ILoginController;
import controller.LoginController;


public class LoginView extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private ILoginController controller;
	private JFrame frame;
	// panels
	private JPanel mainPanel; 
	// buttons
	private JButton btnLogin;
	private JButton btnRegister;
	// radio button group
	private JRadioButton rbTeacher;
	private JRadioButton rbStudent;
	// text fields
	private JTextField txtUser;
	private JTextField txtPassword;
	
	public LoginView() {
		this.controller = new LoginController();
		frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainPanel = new JPanel(new GridLayout(10,2));
		placeComponents();
		addListeners();
		frame.add(mainPanel);

		frame.pack();
		frame.setVisible(true);
	}

	private void addListeners() {
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] cred = getCredentials();
				int type = getType();
				if (cred != null) {
					int res = controller.login(cred[0], cred[1], type);
					if (res >= 0) {
						startWindow(res, type);
					} else
						JOptionPane.showConfirmDialog(frame, "login failed");
				}
			}
		});
		
		btnRegister.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] cred = getCredentials();
				int type = getType();
				if (cred != null) {
					int res = controller.register(cred[0], cred[1], type);
					startWindow(res, type);
				}
			}
		});
	}
	
	
	private void placeComponents() {

		// Create the radio buttons.
	    rbTeacher = new JRadioButton("Teacher");
	    rbTeacher.setMnemonic(KeyEvent.VK_T);
	    rbTeacher.setSelected(true);

	    rbStudent = new JRadioButton("Student");
	    rbStudent.setMnemonic(KeyEvent.VK_S);
		
	    //Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(rbTeacher);
	    group.add(rbStudent);
	    
//	    rbTeacher.setBounds(10, 10, 120, 25);
	    mainPanel.add(rbTeacher);
//	    rbStudent.setBounds(10, 10, 120, 25);
	    mainPanel.add(rbStudent);
	    
		JLabel userLabel = new JLabel("User");
//		userLabel.setBounds(10, 10, 120, 25);
		mainPanel.add(userLabel);

		txtUser = new JTextField(20);
//		txtUser.setBounds(100, 10, 160, 25);
		mainPanel.add(txtUser);

		JLabel passwordLabel = new JLabel("Password");
//		passwordLabel.setBounds(10, 40, 80, 25);
		mainPanel.add(passwordLabel);

		txtPassword = new JPasswordField(20);
//		txtPassword.setBounds(100, 40, 160, 25);
		mainPanel.add(txtPassword);

		btnLogin = new JButton("login");
//		btnLogin.setBounds(10, 80, 120, 25);
		mainPanel.add(btnLogin);
		
		btnRegister = new JButton("Register");
//		btnRegister.setBounds(180, 80, 120, 25);
		mainPanel.add(btnRegister);
	}

	private void startWindow(int userId, int type) {
		frame.dispose();
		if (type == 0)
			new StudentInterface(userId);
		else
			new TeacherView(userId);
	}
	
	private String[] getCredentials() {
		String userName = txtUser.getText();
		String pass = txtPassword.getText();
		if (userName.equals("") || pass.equals("")) {
			JOptionPane.showConfirmDialog(mainPanel, "Please do not leave any fields empty.");
			return null;
		}
		return new String[]{userName, pass};
	}
	
	private int getType() {
		int type = 1;
		if (rbStudent.isSelected())
			type = 0;
		else if (rbTeacher.isSelected())
			type = 1;
		return type;
	}
}

