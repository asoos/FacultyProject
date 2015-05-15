package view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.IROController;
import data.Data;


public class ViewUtil {
	public static JPanel getUserPart(IROController controller, int id) {
		boolean editable = false;
		JPanel userPanel = new JPanel(new GridLayout(5,2));
		
		String name = controller.getNameById(id);
		String surname = controller.getSurnameById(id);
		String fatherName = controller.getFathersNameById(id);
		String gender = controller.getGenderById(id);
		
		Data userData = new Data(name, surname, fatherName, gender, id);
		
		JLabel lblName = new JLabel("Name: ");
		JTextField txtName = new JTextField(userData.getName());
		txtName.setEditable(editable);
		userPanel.add(lblName);
		userPanel.add(txtName);
		
		JLabel lblSurname = new JLabel("Surname: ");
		JTextField txtSurname = new JTextField(userData.getSurname());
		txtSurname.setEditable(editable);
		userPanel.add(lblSurname);
		userPanel.add(txtSurname);
		
		JLabel lblFatherName = new JLabel("Father Name: ");
		JTextField txtFatherName = new JTextField(userData.getFatherName());
		txtFatherName.setEditable(editable);
		userPanel.add(lblFatherName);
		userPanel.add(txtFatherName);
		
		JLabel lblGender = new JLabel("Gender: ");
		JTextField txtGender = new JTextField(userData.getGender());
		txtGender.setEditable(editable);
		userPanel.add(lblGender);
		userPanel.add(txtGender);
		
		JLabel lblStudentId = new JLabel("Student Id: ");
		JTextField txtStudentId = new JTextField(userData.getid());
		txtStudentId.setEditable(editable);
		userPanel.add(lblStudentId);
		userPanel.add(txtStudentId);
		
		return userPanel;
	}
}
