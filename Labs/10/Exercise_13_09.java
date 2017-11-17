
public class Exercise_13_09 {

	public static void main(String[] args) {
		Circle1 circle1 = new Circle1(10,"blue", true);
		Circle1 circle2 = new Circle1(10, "green", false);
		
		System.out.print("Circle 1 radius :: " + circle1.getRadius());
	    System.out.println(" ");
	    System.out.println("Circle 2 radius :: " + circle2.getRadius());
	    System.out.println(" ");
	    
	    System.out.println("It is " + (circle1.equals(circle2) ? true : false) + " that circle1 eauals that of circle2."); 

	  }

	}