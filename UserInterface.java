import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the sides");
		int sides =sc.nextInt();
	    
	    if(sides == 0){
	        System.out.println("Enter the radius");
	        double rad=sc.nextDouble();
	        System.out.printf("Area of the circle is %.2f",3.14*rad*rad);
	    }
	    
	    else if(sides ==3){
	        System.out.println("Enter the base and height");
	        double base =sc.nextDouble();
	        double height=sc.nextDouble();
	        System.out.printf("Area of the Triangle is %.2f",(base*height)/2);
	    }
		else if(sides ==4 )
		{
		    System.out.println("Enter the length");
	        double l =sc.nextDouble();
	        System.out.println("Enter the breadth");
	        double b=sc.nextDouble();
	        if(l==b){
	            System.out.printf("Area of the Square is %.2f",l*b);
	        }
	        else{
	            System.out.printf("Area of the Rectangle is %.2f",l*b);
	        }
		}
		else{
		    System.out.printf("Invalid side");
		}
	}

}
