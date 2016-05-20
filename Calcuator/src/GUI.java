import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.NumberFormatter;

public class GUI extends JFrame {
	
	private JButton add, sub, mul, div, mod, exp;
	private JFormattedTextField num1,num2,answer;
	private JLabel label1,label2, label3;
	public GUI() {
		createUserInterface();
	}

	
	private void createUserInterface() {
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//NumberFormat longFormat = NumberFormat.getIntegerInstance();
		//NumberFormatter numberFormatter = new NumberFormatter(longFormat);
		//numberFormatter.setAllowsInvalid(false); 

		
		num1 = new JFormattedTextField();
		num1.setBounds(100, 10, 300, 30);
		contentPane.add(num1);
		
		num2 = new JFormattedTextField();
		num2.setBounds(100, 50, 300, 30);
		contentPane.add(num2);
		
		answer = new JFormattedTextField();
		answer.setEditable(false);
		answer.setBounds(100, 90, 300, 30);
		contentPane.add(answer);
		
		label1 = new JLabel("#1:");
		label1.setBounds(50, 10, 300, 30);
		contentPane.add(label1);
		
		label2 = new JLabel("#2:");
		label2.setBounds(50, 50, 300, 30);
		contentPane.add(label2);
		
		label3 = new JLabel("Answer");
		label3.setBounds(50, 90, 300, 30);
		contentPane.add(label3);
		
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
