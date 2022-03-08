import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
       
		Scanner scanCalc = new Scanner(System.in);
		
		System.out.print("Input the first number: ");
		num1 = scanCalc.nextInt();

		System.out.println("Enter operator: ");
		operator = scanCalc.nextLine();

		System.out.print("Input the second number: ");
		num2 = scanCalc.nextInt();
       
		
		switch (operator) {
			case "+":
				add(num1, num2);
					break;
			case "-":
				substract(num1, num2);
				break;
			case "*":
				multiply(num1, num2);
					break;
			case "/":
				divide(num1 , num2);
					break;
			default: 
				System.out.println("Enter a valid operator");
				break;
		}
    
    }

    public String add(int a, int b) {
      	int c = a + b;

		return a + "+" + b + "=" + c;
    }

    public String substract(int a, int b) {
    int c = a - b;

		return a + "-" + b + "=" + c;
    }

    public String multiply(int a, int b) {
        int c = a*b;

		return a + "*" + b + "=" + c;
    }

    public String divide(int a, int b) {
        double c = a/(double)b;

		return a + "/" + b + "=" + c;
    }
}