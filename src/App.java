import java.util.Scanner;

class Calculator {
	
	int add(int a, int b) 
	{
		
		int sum = a + b;
		return sum;
		
	}
	int minus(int a, int b)
	{
		
		int sum = a - b;
		return sum;
		
	}
	int multiply(int a, int b)
	{
		
		int sum = a * b;
		return sum;
		
	}
	int division(int a, int b)
	{
		
		int sum = a / b;
		return sum;
		
	}
	
}



public class App {

	public static void main(String[] args) 
	{
	
		Calculator cac = new Calculator();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Co Chcesz Zrobić? 1.Dodawanie 2.Odejmowanie 3.Mnożenie 4. Dzielenie");
		int work = input.nextInt();
		
		int num1;
		int num2;
		int w;
		
		switch(work) {
		
		case 1:
			num1 = input.nextInt();
			num2 = input.nextInt();
			w = cac.add(num1, num2);
			System.out.println(w);
			main(args);
			break;
		case 2:
			num1 = input.nextInt();
			num2 = input.nextInt();
			w = cac.minus(num1, num2);
			System.out.println(w);
			main(args);
			break;
		case 3:
			num1 = input.nextInt();
			num2 = input.nextInt();
			w = cac.multiply(num1, num2);
			System.out.println(w);
			main(args);
			break;
		case 4:
			num1 = input.nextInt();
			num2 = input.nextInt();
			w = cac.division(num1, num2);
			System.out.println(w);
			main(args);
			break;
			
		}
		
		
	}
	
	
}
