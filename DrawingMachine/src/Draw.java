import java.awt.*;
import java.util.Scanner;
import javax.swing.*; 

public class Draw extends Canvas 	
	{	
	private static final long	serialVersionUID = 1L;     	
	public static int chosenWidth, chosenLength, i = 0, x = 0, y = 0, z = 0;
	public static String chosenColor;
	static int width = 0, counter;
	
	public static void main(String[] args)  		
		{	     		
		Questions.askQuestions();
		while(width == 0)
		{
		if(counter > 0)
			{
		Draw canvas = new Draw();
				switch(Questions.backgroundColor)
					{
					case 0:
						{
						canvas.setBackground(Color.white);
						break;
						}
					case 1:
						{
						canvas.setBackground(Color.black);
						break;
						}
					case 2:
						{
						canvas.setBackground(Color.yellow);
						break;
						}			
					}
				JFrame frame = new JFrame();	       
				frame.setSize(200, 200);	       
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	     
				frame.getContentPane().add(canvas);	        			
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				width++;
				}
			else
				{
				
				}
			}

		}     
	
	public void paint(Graphics graphics) 	
		{

				switch(Questions.shapeColor)
					{
					case 0:
						{
						graphics.setColor(Color.blue);
						break;
						}
					case 1:
						{
						graphics.setColor(Color.red);
						break;
						}
					case 2:
						{
						graphics.setColor(Color.green);
						break;
						}
					case 3:
						{
						graphics.setColor(Color.yellow);
						break;
						}
					case 4:
						{
						graphics.setColor(Color.black);
						break;
						}
					case 5:
						{
						graphics.setColor(Color.white);
						break;
						}						
					}		

				switch(Questions.shape)
					{
					case 0:
						{
						graphics.fillRect(10, 10, 20, 20);
						break;
						}
					case 1:
						{
						graphics.fillOval(10, 10, 20, 20);
						break;
						}
					case 2:
						{
						int [] xPoints = {50, 150, 100};
						int [] yPoints = {100, 100, 10};
						int nPoints = 3;
						graphics.fillPolygon(xPoints, yPoints, nPoints);			
						break;
						}
					}
	}
}
