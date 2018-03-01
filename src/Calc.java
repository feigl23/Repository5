import java.util.Scanner;


public class Calc {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println("Calculate with one(1) Argument or three(3)?");
		int with = scanner.nextInt();
		double result =0;
		if(with ==3)
		{
		  System.out.println("Operator:");
		  String muv = scanner.next();
		  System.out.println("First number:");
		  double first = scanner.nextInt();
		  System.out.println("Second number:");
		  double second = scanner.nextInt();
		  System.out.println(calc(first, second, muv));
		}
		else if (with ==1)
		{
			
			System.out.println(calculateWithOneArgument());
		}
		else
			System.out.println("Error");
		scanner.close();
	}
	public static double calculateWithOneArgument()
    {
  
    	Scanner scanner = new Scanner (System.in);
    	System.out.println("Please enter the calculation!");
    	String calculation = scanner.nextLine();
    	
    	double firstOperand = Double.parseDouble(calculation.split(" ")[0]);
        double secondOperand = Double.parseDouble(calculation.split(" ")[2]);
 
        String operator = calculation.split(" ")[1];
        System.out.println(operator);
        double result= calc(firstOperand, secondOperand, operator);
        scanner.close();
        return result;
        
    }
    public static  double calc ( double num1, double num2, String operator)
	{
		double result =0;
		switch(operator)
		{
		
		case "+":
			result= num1+num2;
			break;
			
		case "-":
			result= num1-num2;
			break;
		
		case "*":
			result= num1*num2;
			break;
		case "/":
			if(num2!=0)
				result= num1/num2;
			else
				System.out.println("Don't divide by 0");
			break;
		default :
		System.out.println("Please enter a valid operator");
		
			
		}
		return result;
		
	}

    
}
