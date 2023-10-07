package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame();
	JButton addButton = new JButton("Add Name");
	JButton viewButton = new JButton("View Names");
	JPanel panel = new JPanel();
	
	ArrayList<String> list = new ArrayList<>();
	
	public void setup() {
		panel.add(addButton);
		panel.add(viewButton);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(3);
		
		addButton.addActionListener(this);
		viewButton.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new GuestBook().setup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		
		if (buttonClicked == addButton) {
			list.add(JOptionPane.showInputDialog("enter a name"));
		} 
		
		if (buttonClicked == viewButton) {
			String display = "";
			for (int i = 0; i < list.size(); i++) {
				
				display = display + "Guest #" + (i + 1) + ": " + list.get(i) + "\n";

			}
			
			JOptionPane.showMessageDialog(null, display);
		}
	}
}
