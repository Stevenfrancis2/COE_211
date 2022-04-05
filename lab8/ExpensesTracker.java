import java.io.*;
import java.util.Scanner;
import java.io.File;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      
	Scanner scan = new Scanner(System.in);
	FileWriter fw = new FileWriter(new File("expenses.txt"));
	Scanner fileScan = new Scanner(new File("expenses.txt"));
	BufferedWriter bw = new BufferedWriter(fw);
	PrintWriter outToFile = new PrintWriter(bw);
	String name,what,answer1,person;
	double much;
	String repeat = "y";




	do{
	System.out.println("Input your name: ");
	name = scan.nextLine();

	System.out.println("What did you purchase?");
	what = scan.nextLine();

	System.out.println("How much did you pay? (in USD) ");
	much = scan.nextDouble();
	scan.nextLine();


	outToFile.print(name + " purchased " + what + " for " + much + " US Dollars.");
	outToFile.println();


	System.out.println("Would you like to log another purchase? (y/n)");
	answer1 = scan.nextLine();
	}while(answer1.equalsIgnoreCase(repeat));


	outToFile.close();
	
	System.out.println("Would you like to read a summary of your purchases? (y/n)");
	answer1 = scan.nextLine();

	if(answer1.equalsIgnoreCase(repeat)){
		while(fileScan.hasNext()) {
			person = fileScan.nextLine();
			System.out.println("" + person);
		}
	}

        
   
  }
}
