package view;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import controller.IROController;
import controller.ROController;


public class StudentInterface extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private int userId;
	private IROController roController;
	private JFrame frame;
	// panels
	private JPanel mainPanel;
	String[] Faculties = {"FSEGA", "UBB", "POLI"};
	
	public StudentInterface(int userId) {
		frame = new JFrame("Student");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.roController = new ROController();

		mainPanel = new JPanel(new BorderLayout());
		JPanel userDataPanel = ViewUtil.getUserPart(roController, this.userId);
		mainPanel.add(userDataPanel, BorderLayout.NORTH);
		
	    JComboBox<String> FacultiesList = new JComboBox<String>(Faculties);
		frame.add(mainPanel);
		mainPanel.add(FacultiesList);
		addListeners();

		frame.pack();
		frame.setVisible(true);
	}

	private void addListeners() {
	}
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	StudentInterface app = new StudentInterface(34);
                app.setVisible(true);
            }
        });
}

}
