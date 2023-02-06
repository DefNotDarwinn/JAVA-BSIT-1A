package mightGUI;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.image.*;
import javax.swing.*;
public class Frame extends JFrame implements ActionListener{
	JTextField textbox, textbox1, textbox2, textbox3, textbox4, textbox5, textbox6, textbox7 ;
	JButton button;
	Frame(){
	
	//JFrame
		JFrame frame = new JFrame();
		ImageIcon jpg = new ImageIcon("uchiha.png");
		Toolkit tool = frame.getToolkit();
		Dimension size = tool.getScreenSize();
		JLabel label = new JLabel();
		textbox = new JTextField();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		textbox2 = new JTextField();
		JLabel label3 = new JLabel();
		textbox3 = new JTextField();
		JLabel label4 = new JLabel();
		textbox4 = new JTextField();
		JLabel label5 = new JLabel();
		textbox5 = new JTextField();
		JLabel label6 = new JLabel();
		textbox6  = new JTextField();
		JLabel label7 = new JLabel();
		textbox7 = new JTextField();
		button = new JButton();		
		
		
	//Frame
		frame.setSize(400, 550);
		frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);	
		frame.setIconImage(jpg.getImage());
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Simple Employer Salary Calculator");
		frame.getContentPane().setBackground(Color.lightGray);
		
	//Layer ~~ 1
		label.setText("PAYROLL MANAGEMENT SYSTEM");
		label.setBounds(20, 10, 450, 40);
		label.setFont(new Font("Calibri", Font.BOLD, 25));
		label.setForeground(Color.BLACK);
		
		
		//Employers Name
		label1.setText("Employer's Name:");
		label1.setBounds(20, 50, 150, 40);
		label1.setFont(new Font("Calibri", Font.BOLD, 13));
		label1.setForeground(Color.black);
		textbox.setBounds(170, 50, 150, 30);
		textbox.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		textbox.setForeground(Color.black);
		textbox.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
		
		
		
		//Employees Reference Number
		label2.setText("Employee Ref. No.:");
		label2.setBounds(20, 90, 150, 40);
		label2.setFont(new Font("Calibri", Font.BOLD, 13));
		label2.setForeground(Color.black);
		textbox2.setBounds(170, 90, 150, 30);
		textbox2.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		textbox2.setForeground(Color.black);
		textbox2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
		
		//Employees Name
		label3.setText("Employee's Name:");
		label3.setBounds(20, 130, 150, 40);
		label3.setFont(new Font("Calibri", Font.BOLD, 13));
		label3.setForeground(Color.black);
		textbox3.setBounds(170, 130, 150, 30);
		textbox3.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		textbox3.setForeground(Color.black);
		textbox3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
		
		
		//Designation 
		label4.setText("Designation:");
		label4.setBounds(20, 170, 150, 40);
		label4.setFont(new Font("Calibri", Font.BOLD, 13));
		label4.setForeground(Color.black);
		textbox4.setBounds(170, 170, 150, 30);
		textbox4.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		textbox4.setForeground(Color.black);
		textbox4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
		
		
		//Working Hours
		label5.setText("Working Hours:");
		label5.setBounds(20, 210, 150, 40);
		label5.setFont(new Font("Calibri", Font.BOLD, 13));
		label5.setForeground(Color.black);
		textbox5.setBounds(170, 210, 150, 30);
		textbox5.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		textbox5.setForeground(Color.black);
		textbox5.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
		
		
		//Rate
		label6.setText("Rate:");
		label6.setBounds(20, 250, 150, 40);
		label6.setFont(new Font("Calibri", Font.BOLD, 13));
		label6.setForeground(Color.black);
		textbox6.setBounds(170, 250, 150, 30);
		textbox6.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		textbox6.setForeground(Color.black);
		textbox6.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
		
		//Overtime
		label6.setText("Overtime:");
		label6.setBounds(20, 255, 150, 40);
		label6.setFont(new Font("Calibri", Font.BOLD, 13));
		label6.setForeground(Color.black);
		textbox6.setBounds(170, 250, 150, 30);
		textbox6.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		textbox6.setForeground(Color.black);
		textbox6.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
		
		//Overtime
		label7.setText("Rate:");
		label7.setBounds(20, 290, 150, 40);
		label7.setFont(new Font("Calibri", Font.BOLD, 13));
		label7.setForeground(Color.black);
		textbox7.setBounds(170, 290, 150, 30);
		textbox7.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		textbox7.setForeground(Color.black);
		textbox7.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
		
		//Button
		button.setBounds(120, 340, 130, 40);
		button.setText("Submit");
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		button.setFocusable(false);
		button.setBackground(Color.GRAY);
		button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
		button.addActionListener(this);
		
		
		
		//Setup
		frame.add(label);
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(label7);
		frame.add(button);
		frame.add(textbox2);
		frame.add(textbox3);
		frame.add(textbox4);
		frame.add(textbox5);
		frame.add(textbox6);
		frame.add(textbox7);
		frame.add(textbox);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String employer = textbox.getText();
		String refId = textbox2.getText();
		String employee = textbox3.getText();
		String position = textbox4.getText();
		String workhours= textbox5.getText();
		String OT = textbox6.getText();
		String rt = textbox7.getText();
		
		//convert String to Float
		double wrkhours = Double.parseDouble(workhours);
		double overtime = Double.parseDouble(OT);
		double rate = Double.parseDouble(rt);
		
		//grosspay
		double totalhours = wrkhours + overtime;
		
		double grosspay = (totalhours * rate) * 5 * 4;
		double pagibig = (double) (grosspay* 0.01);
		double philhealth = (double) (grosspay* 0.0275);
		double sss = (double) (grosspay * 0.11);
		double netpay = (double) grosspay - philhealth - sss - pagibig;
		
		
		if (e.getSource().equals(button))	{
			JOptionPane.showMessageDialog(this, "Employer's name: " + employer +
					"\nEmployee Ref. No.: " + refId +
					"\nEmployee's Name: " + employee + 
					"\nDesignation: " + position +
					"\nGross Pay: " + String.format("%.2f", grosspay) +
					"\nPagibig: " + String.format("%.2f", pagibig) +
					"\nPhilhealth: " + String.format("%.2f", philhealth) +
					"\nSSS: " + String.format("%.2f", sss) +
					"\nNetPay: " + String.format("%.2f", netpay));
					
		
		
		}		
		
	}

}
