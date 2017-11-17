
public abstract class GeometricObject_09
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated; 
		  
	protected GeometricObject_09()
	{
		dateCreated = new java.util.Date();
	}
	  
	protected GeometricObject_09(String color, boolean filled)
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	  
	public String getColor()
	{
		return color;
	}
	  
	public void setColor(String color)
	{
		this.color=color;
	}
	  
	public boolean isFilled()
	{
		return filled;
	}
	  
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	  
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	  
	@Override
	public String toString()
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	  
	public abstract double getArea();
	  
	public abstract double getPerimeter();

	public int compareTo(Circle1 circle1, Circle1 circle2)
	{
		if (circle1.compareTo(circle2) == 0)
		{
			return 0;
		}
	    else
	    {
	    		return 1;
	    }
	}
}