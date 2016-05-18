import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class GUI extends JFrame {

	public GUI() {
		createUserInterface();
	}

	private void createUserInterface() {
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		setSize(500, 500);
		setVisible(true);
		setTitle("Calculator");

	}
	
	public static void main(String[] args){
		GUI calculator = new GUI();
	}
}
