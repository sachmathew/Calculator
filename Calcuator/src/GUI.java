import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class GUI extends JFrame {
	
	private JButton add, sub, mul, div, mod, equal;
	private JTextField numberBox;

	public GUI() {
		createUserInterface();
	}

	private void createUserInterface() {
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		setSize(500, 500);
		setVisible(true);
		setTitle("Calculator");
		
		add = new JButton("ADD");
		add.setBounds(60, 300, 70, 30);
		contentPane.add(add);
	
		sub = new JButton("SUB");
		sub.setBounds(200, 300, 70, 30);
		contentPane.add(sub);
		
		mul = new JButton("MUL");
		mul.setBounds(340, 300, 70, 30);
		contentPane.add(mul);
		
	}
	
	public static void main(String[] args){
		GUI calculator = new GUI();
	}
}
