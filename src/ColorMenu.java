import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ColorMenu extends JFrame implements ActionListener
{
	private static final int APP_WIDTH = 300;
	private static final int APP_HEIGHT = 300;
	
	JPanel redPanel;
	JPanel greenPanel;
	JPanel bluePanel;
	
	public ColorMenu()
	{
		super();
		
		setSize(APP_WIDTH, APP_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,3));
		
		redPanel = createPanel(Color.RED);
		greenPanel = createPanel(Color.GREEN);
		bluePanel = createPanel(Color.BLUE);
		
		makeMenu();
	}
	
	public void makeMenu()
	{
		//create a menu bar which can hold lots of menus
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//create a menu to add to the menu bar
		JMenu menu = new JMenu("Colors");
		menuBar.add(menu);
		
		addMenuItem("Red", menu);
		addMenuItem("Green", menu);
		addMenuItem("Blue", menu);
	}
	
	public void addMenuItem(String label, JMenu menu)
	{
		JMenuItem menuItem = new JMenuItem(label);
		menuItem.addActionListener(this);
		//add action listener
		menu.add(menuItem);
	}
	
	public JPanel createPanel(Color color)
	{
		JPanel myPanel = new JPanel();
		myPanel.setBackground(color);
		add(myPanel);
		myPanel.setVisible(false);
		return myPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String menuText = e.getActionCommand().toLowerCase();
		
		switch(menuText)
		{
		case "red":
			redPanel.setVisible(!redPanel.isVisible());
			break;
		case "green":
			greenPanel.setVisible(!greenPanel.isVisible());
			break;
		case "blue":
			bluePanel.setVisible(!bluePanel.isVisible());
			break;
		}
	}
	
	public static void main(String[] args)
	{
		ColorMenu program = new ColorMenu();
		program.setVisible(true);
	}
}
