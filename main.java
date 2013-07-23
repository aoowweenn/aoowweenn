import java.util.Random;
import java.lang.*;

class circle
{
	double r;
	circle()
	{
		r = 0.0;
	}
	circle(double r)
	{
		this.r = r;
	}
	boolean is_inside(double x, double y)
	{
		if(x*x + y*y < this.r*this.r)
			return true;
		else
			return false;
	}
}


public class main
{
	public static void main(String args[])
	{
		System.out.println("Hello World!");
		circle my_circle = new circle(1.0);

		int count = (int)Math.pow(10.0,7.0);
		int sum = 0;
		int i;

		Random rand = new Random();

		for(i = 0; i < count; ++i)
			if(my_circle.is_inside(rand.nextDouble(), rand.nextDouble()))
				++sum;

		System.out.println((double)sum*4/count);
	}
}

