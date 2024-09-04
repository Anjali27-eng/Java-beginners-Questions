import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter weight in kg");
		double weight=sc.nextDouble();
		
		System.out.println("Enter height in cm");
		double height=sc.nextDouble();
		
		double height1=height/100;
		
		double bmi =weight/(height1 * height1);
		
		System.out.printf("Your BMI is %.2f. ",bmi);
		
		if(bmi > 25){
		System.out.println("You are overweight");
		double reduce=bmi-25;
		System.out.printf("Reduce %.2f kg to be fit",reduce);
		}
		else if(bmi < 18.5){
		    System.out.println("You are underweight");
		    //double min =18.5*height1*height1;
		    double Gain = 18.5 - bmi;
		    System.out.printf("Gain %.2f kg to be fit",Gain);
		}
		else if(bmi < 25 && bmi >=18.5){
		     System.out.println("You are fit and healthy");
		}
		else{
		    System.out.println("Invalid");
		}
		sc.close();
	}

}
