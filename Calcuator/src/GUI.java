import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class GUI extends JFrame {
	
	private JButton add, sub, mul, div, mod, exp;
	private JTextField numberBox;

	public GUI() {
		createUserInterface();
	}

	private void createUserInterface() {
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		
		add = new JButton("ADD");
		add.setBounds(60, 300, 70, 30);
		contentPane.add(add);
		add.addActionListener(

				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
					
				
					}		
				}

				);
	
		sub = new JButton("SUB");
		sub.setBounds(200, 300, 70, 30);
		contentPane.add(sub);
		sub.addActionListener(

				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
					
				
					}		
				}

				);
		
		mul = new JButton("MUL");
		mul.setBounds(340, 300, 70, 30);
		contentPane.add(mul);
		mul.addActionListener(

				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
					
				
					}		
				}

				);
		
		div = new JButton("DIV");
		div.setBounds(60, 350, 70, 30);
		contentPane.add(div);
		div.addActionListener(

				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
					
				
					}		
				}

				);
	
		mod = new JButton("MOD");
		mod.setBounds(200, 350, 70, 30);
		contentPane.add(mod);
		mod.addActionListener(

				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
					
				
					}		
				}

				);
		exp = new JButton("EXP");
		exp.setBounds(340, 350, 70, 30);
		contentPane.add(exp);
		exp.addActionListener(

				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
					
				
					}		
				}

				);
		setSize(500, 500);
		setVisible(true);
		setTitle("Calculator");
	}
	
	public static void main(String[] args){
		GUI calculator = new GUI();
	}
}
