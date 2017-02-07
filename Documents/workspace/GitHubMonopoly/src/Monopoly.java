import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;


public class Monopoly extends JFrame {
	
	
	public Monopoly() 
	{
		
		JPanel jp = new JPanel();
		JLabel jl = new JLabel();
		
		
		setSize(1200, 800);
		setVisible(true);
		setTitle("Monopoly - The Starboys");
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int w = getSize().width;
		int h = getSize().height;
		int x = (dim.width-w)/2;
		int y = (dim.height-h)/2;
		
		setLocation(x, y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Image of board
		jl.setIcon(new ImageIcon("/Users/gavincoll/Downloads/monopoly_background_by_gr8koog.jpg"));
		jp.add(jl);
		add(jp);
		validate();
		jp.setLocation(-215, 10); //Position of image
	
	}
	
		
	
	public void paint(Graphics g) {
        super.paint(g);  // fixes the immediate problem.
        Graphics2D g2 = (Graphics2D) g;
        Line2D lin = new Line2D.Float(10, 1500, 1000, 1500);
        g2.draw(lin);
    }
	
	public static void main(String[] args)
	{
		Monopoly Monopoly = new Monopoly();
	}

	
}