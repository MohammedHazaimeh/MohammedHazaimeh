package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Event {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		
		JLabel label1 = new JLabel("welcome!!"
				+ " To see if you can vote, please enter your age");
	
		label1.setBounds(20,20,350,20);
		 frame.add(label1);
		
		JTextField textField = new JTextField(20);	
		textField.setBounds(50,50,140,30);
	     frame.add(textField);
		
		
		frame.setLayout(new FlowLayout());
		
		
		JButton button = new JButton("Input");
       button.setBounds(250,50,90,30);
		frame.add(button);
		
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 
				  
				String age= new String (textField.getText());
								
				if(age.equalsIgnoreCase("1") ||age.equalsIgnoreCase("2") || age.equalsIgnoreCase("3")|| age.equalsIgnoreCase("4") ||age.equalsIgnoreCase("5") || age.equalsIgnoreCase("6")
						||age.equalsIgnoreCase("7") ||age.equalsIgnoreCase("8") || age.equalsIgnoreCase("9")|| age.equalsIgnoreCase("10") ||age.equalsIgnoreCase("11") || age.equalsIgnoreCase("12")||
						age.equalsIgnoreCase("13") ||age.equalsIgnoreCase("14") || age.equalsIgnoreCase("15")|| age.equalsIgnoreCase("16") ||age.equalsIgnoreCase("17")) {
					
					
					System.out.println(" can't you vote");

					JFrame frame1 = new JFrame();
					frame1.setSize(200,200);
					frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
					frame1.setLayout(null);
					
				JLabel label2 = new JLabel("can't you vote");
				frame1.add(label2);
				
				frame1.setLayout(new FlowLayout());
				
				frame1.setVisible(true);
			       frame1.setLocationRelativeTo(null);
				}
				
				
				
				else {
					System.out.println(" can you vote");
					JFrame frame2 = new JFrame();
					frame2.setSize(200,200);
					frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
					frame2.setLayout(null);
					
				JLabel label2 = new JLabel("can you vote");
				frame2.add(label2);
				
				frame2.setLayout(new FlowLayout());
				
				frame2.setVisible(true);
			       frame2.setLocationRelativeTo(null);
				}
					
				
				
				
				
			
			}});
		frame.setLayout(null);
		frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
	}

}
