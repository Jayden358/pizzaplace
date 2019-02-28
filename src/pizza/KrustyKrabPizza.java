package pizza;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class KrustyKrabPizza {
	JFrame myFrame;
	JPanel contentPane;
	FlowLayout fLayout;
	GridLayout gLayout;
	BorderLayout bLayout;
	BoxLayout xLayout;
	JPanel myPanel;
	JTextField customerName;
	JPanel sizeButton;
	
	public static void main(String[] args) {
		new KrustyKrabPizza();
		

	}
	public KrustyKrabPizza()  { 
		//creation of the frame
		myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(200,200);
		myFrame.setTitle("PizzaPlace");
		
		//creation of main panel
		myPanel=(JPanel)myFrame.getContentPane();
		myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.Y_AXIS));
		Border mainBorder = BorderFactory.createEmptyBorder(10,10,10,10);
		myPanel.setBorder(mainBorder);
		
		
		//create top panel elements
		JPanel topPanel= new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,10));
		JLabel nameLB= new JLabel("Name");
		customerName= new JTextField(20);
		
		//add elements to top panel
		topPanel.add(nameLB);
		topPanel.add(customerName);
		
		//pizza size panel
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//add panels to main panel
		myPanel.add(topPanel);
		
		
		
		
		
		
		myFrame.pack();
		myFrame.setVisible(true);
		
		
				
	}
}
	

