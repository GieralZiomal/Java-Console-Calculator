import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Wybierz co chcesz obliczyć 1.Dodawanie 2.Odejmowanie 3.Mnożenie 4.Dzielenie");
		int line = input.nextInt();
		if (line == 1) 
		{
			
			System.out.println("Podaj pierwsza liczbę: ");
			int num1 = input.nextInt();
			System.out.println("Podaj druga liczbę: ");
			int num2 = input.nextInt();
			int num3 = num1 + num2;
			System.out.println(num3);
			main(args);
			
			
		} else if (line == 2) 
		{
			
			System.out.println("Podaj pierwsza liczbę: ");
			int num1 = input.nextInt();
			System.out.println("Podaj druga liczbę: ");
			int num2 = input.nextInt();
			int num3 = num1 - num2;
			System.out.println(num3);
			main(args);
			
			
		}
		else if (line == 3) 
		{
			
			System.out.println("Podaj pierwsza liczbę: ");
			int num1 = input.nextInt();
			System.out.println("Podaj druga liczbę: ");
			int num2 = input.nextInt();
			int num3 = num1 * num2;
			System.out.println(num3);
			main(args);
			
			
		}
		else if (line == 4) 
		{
			
			System.out.println("Podaj pierwsza liczbę: ");
			int num1 = input.nextInt();
			System.out.println("Podaj druga liczbę: ");
			int num2 = input.nextInt();
			int num3 = num1 / num2;
			System.out.println(num3);
			main(args);
			
			
		}
	}

}
