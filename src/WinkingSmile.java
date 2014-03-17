import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WinkingSmile extends JFrame implements ActionListener
{
	private static final int APP_WIDTH = 400;
	private static final int APP_HEIGHT = 400;
	private boolean winking = false;
	
	public WinkingSmile()
	{
		super();
		setSize(APP_WIDTH, APP_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setBackground(Color.WHITE);
		
		setLayout(new BorderLayout());
		
		JLabel northLabel = new JLabel();
		add(northLabel, BorderLayout.NORTH);
		
		JButton southButton = new JButton("Wink");
		add(southButton, BorderLayout.SOUTH);
		southButton.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				winking = !winking;
				repaint();
				
			}				
	});
		add(southButton, BorderLayout.SOUTH);
	}
	
	public void paint (Graphics g)
	{
		super.paint(g);
		
		Font font = new Font ("Serif", Font.BOLD|Font.ITALIC, 36);
		g.setFont(font);
		g.setColor(Color.BLUE);
		g.drawString("Hi Everyone!", 25, 60);
		
		g.drawOval(100, 100, 200, 200);
		g.drawOval(155, 160, 20, 20);
		
		if(!winking)
		{
			g.drawOval(230, 160, 20, 20);
		}
		else
		{
			g.drawLine(230, 170, 250, 170);
		}
		
		
		//g.drawLine(150, 250, 250, 250);
		g.drawArc(150, 235, 100, 200, 45, 90);
	}
	

	
	public static void main(String[] args)
	{
		WinkingSmile program = new WinkingSmile();
		program.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
