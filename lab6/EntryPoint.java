import java.util.Scanner;

public class EntryPoint{ 
    public static void main (String[] args) {
	String num;
	System.out.println("Which service would you like to use? /n" + "[1]: Basic week visualizer /n" + "[2]: Advanced week visualizer /n" + "[3]: Basic calculator /n" + "[4]: Employee repertoire /n");
	num = scan.nextLine();

	Scanner scan = new Scanner(System.in);
	num = scan.nextLine();
	do {
	if(num == 1){
		BasicWeek wall = new BasicWeek();
		wall.printDays();
	}
	
	else if(num == 2){
		AdvancedWeek advweek = new AdvancedWeek();
		}
	else if(num == 3){
		Calculator calc = new Calculator();
	}
	else if(num == 4){
		Employee emp = new Employee();
		String temp = emp.toString();
	}
	else{
		System.out.println("Please make sure you pick a number between 1 and 4");}
	}while(num == "y");
		
   }
}