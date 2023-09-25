//Parker Hinrichs (02.09.2023) Assignment 2 (TURTLE ATTACK)

class Model
{
	int turtle_x;
	int turtle_y;
	int dest_x;
	int dest_y;

	//Constructor
	Model()
	{
	}

	public void update()
	{
		// Move the turtle
		if((this.dest_x >= 0) && (this.dest_y >= 0)) //ERROR HANDELING: Prevents reversing of controlls (inside of window)
		{
			if(this.turtle_x < this.dest_x)
				this.turtle_x += Math.min(4, dest_x - turtle_x);
			else if(this.turtle_x > this.dest_x)
				this.turtle_x -= Math.min(4, dest_x + turtle_x);
			if(this.turtle_y < this.dest_y)
				this.turtle_y += Math.min(4, dest_y - turtle_y);
			else if(this.turtle_y > this.dest_y)
				this.turtle_y -= Math.min(4, dest_y + turtle_y);
		}
		if((this.dest_x < 0) || (this.dest_y < 0)) //ERROR HANDELING: Prevents reversing of controlls (outside of window)
		{
			if(this.turtle_x < this.dest_x)
				this.turtle_x += 4;
			else if(this.turtle_x > this.dest_x)
				this.turtle_x -= 4;
			if(this.turtle_y < this.dest_y)
				this.turtle_y += 4;
			else if(this.turtle_y > this.dest_y)
				this.turtle_y -= 4;
		}
	}

	public void setDestination(int x, int y)
	{
		this.dest_x = x;
		this.dest_y = y;
	}
}
