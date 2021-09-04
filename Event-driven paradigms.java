package EventDriven;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Scanner;

public class Huld {

	public static void main(String[] args) {
		
		JFrame frame =new JFrame ("");
		frame.setSize(310,300);
		
		
		JButton b1= new JButton(" say Hello");
		
		String name =JOptionPane.showInputDialog("Enter your Name");
		
		
		String brathday =JOptionPane.showInputDialog("Enter your brathday");
		int brathdayrNumber=Integer.parseInt(brathday);
		
		int age= 2021 - brathdayrNumber;
				System.out.println(name +"you are age"+ age);
				JOptionPane.showMessageDialog(null,name +"you are age"+ age);
				
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
  }
}
		
		
