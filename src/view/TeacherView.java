package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
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
	// buttons
	private JButton btnAddCourse;
	
	public TeacherView(int userId) {
		frame = new JFrame("Teacher");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.roController = new ROController();

		mainPanel = new JPanel(new BorderLayout());
		JPanel userDataPanel = ViewUtil.getUserPart(roController, this.userId);
		mainPanel.add(userDataPanel, BorderLayout.NORTH);
		
		frame.add(mainPanel);
		frame.add(getCentralPanel(), BorderLayout.CENTER);
		
		btnAddCourse = new JButton("Add Course");
		
		addListeners();

		frame.pack();
		frame.setVisible(true);
	}

	private JPanel getCentralPanel() {
		JPanel centralP = new JPanel(new GridLayout(1,1));
		
		List<Object> faculties = roController.getStudentFacultiesById(userId);
		JComboBox<Object> cbFaculties = null;
		if (faculties != null)
			cbFaculties = new JComboBox<Object>(faculties.toArray());
		else
			cbFaculties = new JComboBox<Object>();
		
		List<Object> lectures = roController.getTeacherLecturesById(userId);
		JComboBox<Object> cbLectures = null;
		if (lectures != null)
			cbLectures = new JComboBox<Object>(lectures.toArray());
		else
			cbLectures = new JComboBox<Object>();
		
		return centralP;
	}
	
	private void addListeners() {
		btnAddCourse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog addDialog = new JDialog(frame);
				addDialog.setTitle("Create Course");
				JButton add = new JButton("Add");
				addDialog.add(add);
			}
		});
	}
}

