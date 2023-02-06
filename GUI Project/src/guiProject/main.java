package guiProject;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
public class main {
	public static void main (String[] args) {
		
		JFrame frame = new JFrame();
		ImageIcon img = new ImageIcon("logo.jpg");
		ImageIcon png = new ImageIcon(new ImageIcon("STS.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		Toolkit tool = frame.getToolkit();
		Dimension size = tool.getScreenSize();
		JLabel label = new JLabel();
		
		frame.setSize(300, 350);
		frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);	
		
		
		frame.setTitle("Summertime Saga");
		
		
		frame.setIconImage(img.getImage());
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		label.setText("Home");
		label.setBorder(BorderFactory.createLineBorder(Color.black,3));
		label.setBounds(20, 20, 150, 150);
		label.setForeground(new Color(0x000000));
		label.setFont(new Font("Times New Roman" , Font.BOLD, 13));
		label.setIcon(png);
		label.setHorizontalTextPosition(label.CENTER);
		label.setVerticalTextPosition(label.BOTTOM);
		
		frame.add(label);
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		
		
		
		
		
		
		
		
		
		
	}
}
