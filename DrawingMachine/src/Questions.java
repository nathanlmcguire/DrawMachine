import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Questions 
	{
	private static final long serialVersionUID = 1L;
	static int shape; 
	static int shapeColor;
	static int backgroundColor;
	static int height;
	static JFrame frame = new JFrame();

	public static void askQuestions()
	    {
	    Object[] optionsThree = {"Square", "Circle", "Triangle"};
		shape = JOptionPane.showOptionDialog(frame, "What shape do you want to draw?",
				"Shape Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionsThree, optionsThree[1]);	
		
		Object[] optionsOne = {"White", "Black", "Yellow"};
		backgroundColor = JOptionPane.showOptionDialog(frame, "What color do you want the background to be?",
				"Background Color Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionsOne, optionsOne[2]);
		
		String[] preMadeArray = new String[] {"Blue", "Red", "Green", "Yellow", "Black", "White"}; 
		JButton button = new JButton("Enter");
		final JComboBox<String> dropdown = new JComboBox<String>(preMadeArray);		
		final JPanel panel = new JPanel();
		frame.setLocationRelativeTo(null);
    	frame.setSize(300, 100);		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(dropdown);
		panel.add(button);
		button.addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent arg0) 
 			{				
				shapeColor = dropdown.getSelectedIndex();
				Draw.counter++;				
				frame.dispose();
				}
 		});
		frame.setVisible(true);		
		//JPanel.YES_NO_CANCEL_OPTION;
		
		/*Object[] optionsTwo = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		shapeColor = JOptionPane.showOptionDialog(frame, "What color do you want the shape to be?",
				"Shape Color Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
			null, optionsTwo, optionsTwo[2]);*/
	    }
	}