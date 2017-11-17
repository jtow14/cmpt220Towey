
public class Exercise_13_11
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		  Octagon ocatgon1 = new Octagon(5.0);
	    
		  System.out.println("Octagon 1 :: ");
		  System.out.println("Perimeter = " + ocatgon1.getPerimeter());
		  System.out.println("Area = " + ocatgon1.getArea());
		  System.out.println("");
	    
		  Octagon octagon2 = (Octagon) ocatgon1.clone();
	    
		  System.out.println("\nOctagon1 when comapred to Octagon2: " + ocatgon1.compareTo(octagon2));
	}
}