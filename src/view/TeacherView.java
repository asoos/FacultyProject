package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.IROController;
import controller.ROController;


public class TeacherView extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private int userId;
	private IROController roController;
	private JFrame frame;
	// panels
	private JPanel mainPanel;
	
	public TeacherView(int userId) {
		frame = new JFrame("Teacher");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.roController = new ROController();

		mainPanel = new JPanel(new BorderLayout());
		JPanel userDataPanel = ViewUtil.getUserPart(roController, this.userId);
		mainPanel.add(userDataPanel, BorderLayout.NORTH);
		
		frame.add(mainPanel);
		frame.add(getCentralPanel(), BorderLayout.CENTER);
		
		addListeners();

		frame.pack();
		frame.setVisible(true);
	}

	private JPanel getCentralPanel() {
		JPanel centralP = new JPanel(new GridLayout(1,1));
		
//		List<Object> faculties = roController.getFacultiesById(userId);
		
		
		return centralP;
	}
	
	private void addListeners() {
	}
}

