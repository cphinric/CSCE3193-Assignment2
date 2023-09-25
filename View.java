//Parker Hinrichs (02.09.2023) Assignment 2 (TURTLE ATTACK)

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import javax.swing.JButton;
import java.awt.Color;

class View extends JPanel
{
	JButton b1;
	BufferedImage turtle_image;
	Model model;
	
	//Constructor
	View(Controller c, Model m)
	{
		model = m;
		c.setView(this);
		b1 = new JButton("Don't push me");
		b1.addActionListener(c);
		this.add(b1);

		//Error handeling (Try-catch exeption)
		try 
		{
			this.turtle_image = ImageIO.read(new File("turtle.png"));
		}
		catch(Exception e) //Exception if unable to read file
		{
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}

	void removeButton()
	{
		this.remove(b1);
		this.repaint();
	}

	public void paintComponent(Graphics g)
	{
		g.setColor(new Color(128, 255, 255));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.drawImage(this.turtle_image, model.turtle_x, model.turtle_y, null);
	}
}

