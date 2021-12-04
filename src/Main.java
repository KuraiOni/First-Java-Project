import java.util.Scanner;	 
import javax.swing.JOptionPane;
import java.util.Random;


public class Main {

	public static void main(String[] arges) {
		
		
		
//		System.out.println("First Sentence");
//		System.out.println("Some Other Line\n");
//		System.out.println("Hello\n");
//		
//		
//		// This a comment
//		
//		/*
//		 * This is 
//		 * a comment
//		 * with multiple
//		 * lines
//		 */
//		
//		
//		//Variables
//		
//		/*
//		 * list of datatype:
//		 * byte
//		 * short
//		 * float
//		 * long
//		 */
//		
//		int x = 23;
//		double y = 8.63765;
//		boolean value = true;
//		char wtvr = '@';
//		String sent = "This is a string";
//		
//		System.out.println(x);
//		
//		
//		// Swaping Variables
//		
//		
//		String X = "Water";
//		String Y = "Orange";
//		String temp;
//		
//		temp = X; 
//		X = Y;
//		Y = temp;
//		
//		System.out.println("X: "+X);
//		System.out.println("Y: "+Y);
//		
//		// Scanner 
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("What is your name? ");
//		String name = scanner.nextLine();
//		System.out.println("How old are you? ");
//		int age = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("What is your favorite food? ");
//		String food = scanner.nextLine();
//		
//		System.out.println("Your name is "+name);
//		System.out.println("You are "+age+" years old");
//		System.out.println("Your favorite food is "+food);
		
		
		//GUI Interface
		
//		String id = JOptionPane.showInputDialog("Enter your name");
//		JOptionPane.showMessageDialog(null, "Hello "+id);
//		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
//		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height	"));
//		JOptionPane.showMessageDialog(null, "You are"+height+" cm tall");
		
		
		
		// Math Class
		
//		double X;
//		double Y;
//		double Z;
//		
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter the value of X: ");
//		X = scanner.nextDouble();
//		System.out.println("Enter the value of Y: ");
//		Y = scanner.nextDouble();
//		
//		
//		Z = Math.sqrt((X*X)+(Y*Y));
//		
//		System.out.println("The hypotrnus is: "+Z);
//		
//		scanner.close();
		
		//Random Class
		
//		Random random = new Random();
//		
//		int X = random.nextInt(10);
//		System.out.println(X);
//		
//		double Y = random.nextDouble();
//		System.out.println(Y);
		
		
		// if Statements
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("What is your name? ");
//		String X = scanner.nextLine();
//		System.out.println("How old are you? ");
//		double Y = scanner.nextDouble();
//		scanner.nextLine();
//		System.out.println("How tall are you? ");
//		double Z = scanner.nextDouble();
//		scanner.nextLine();
//		
//		
//		System.out.println("Your name is: "+X);
//		System.out.println("You are "+Y+" years old");
//		System.out.println("You are "+Z+" cm tall");
//		
//		scanner.close();
//		
//		
//		if(Y>=18 && Z>=175) {
//			System.out.println("You are to be in the back");
//		}
//		else if(Y>=13 && Z>=165) {
//			System.out.println("You are to be in the middle");
//		}
//		else {
//			System.out.println("You are to be in the front");
//		}
		
		
		// switch = statement that allows a variable to be tested for equality against a list of values
		  
//		  String day = "Friday";
//		  
//		  switch(day) {
//		   case "Sunday": System.out.println("It is Sunday!");
//		   break;
//		   case "Monday": System.out.println("It is Monday!");
//		   break;
//		   case "Tuesday": System.out.println("It is Tuesday!");
//		   break;
//		   case "Wednesday": System.out.println("It is Wednesday!");
//		   break;
//		   case "Thursday": System.out.println("It is Thursday!");
//		   break;
//		   case "Friday": System.out.println("It is Friday!");
//		   break;
//		   case "Saturday": System.out.println("It is Saturday!");
//		   break;
//		   default: System.out.println("That is not a day!");
//		  }
		
		
		// While Loops
		
//		Scanner scanner = new Scanner(System.in);
//		String name = "";
//		
//		
//		while(name.isBlank()) {
//			System.out.println("Enter your name: ");
//			name = scanner.nextLine();
//		}
//		
//		System.out.println("Your name is: "+name);
//		
//		do{
//			System.out.println("Enter your name: ");
//			name = scanner.nextLine();
//		}while(name.isBlank()) ;
//		
//		System.out.println("Your name is: "+name);
		
		
		// For loops 
		
		
//		for(int i=0; i<=10; i++ ) {
//			System.out.println(i);
//		}
//		
//		System.out.println("Hello");
//		
//		for(int i=10; i>=0; i--) {
//			System.out.println(i);
//		}
		
		//Nested Loopes
		
//		Scanner scanner = new Scanner(System.in);
//		int rows;
//		int columns;
//		String symbol = "";
//		
//		
//		System.out.println("Enter the number of rows: ");
//		rows = scanner.nextInt();
//		System.out.println("Enter the number of columns: ");
//		columns = scanner.nextInt();
//		System.out.println("Enter the symbol: ");
//		symbol = scanner.next();
//		
//		for(int i=1; i<=rows; i++) {
//			System.out.println();
//			for(int j=1; j<=columns; j++) {
//				System.out.print(symbol);
//			}
//		}
		
		
		//Arrays
		
//		String[] cars = new String[3];
//		
//		cars[0] = "tesla";
//		cars[1] = "mustang";
//		cars[2] = "camaro";
//		
//		for(int i=0; i<cars.length; i++) {
//			System.out.println(cars[i]);
//		}
		
		// 2D array = an array of arrays
		
//				String[][] cars = 	{	
//										{"Camaro","Corvette","Silverado"},
//										{"Mustang","Ranger","F-150"},
//										{"Ferrari","Lambo","Tesla"}
//									};
//				
//				/*
//				cars[0][0] = "Camaro";
//				cars[0][1] = "Corvette";
//				cars[0][2] = "Silverado";
//				cars[1][0] = "Mustang";
//				cars[1][1] = "Ranger";
//				cars[1][2] = "F-150";
//				cars[2][0] = "Ferrari";
//				cars[2][1] = "Lambo";
//				cars[2][2] = "Tesla";
//				*/
//				
//				for(int i=0; i<cars.length; i++) {
//					System.out.println();
//					for(int j=0; j<cars[i].length; j++) {
//						System.out.print(cars[i][j]+" ");
//					}
//				}
		
		 //   reference data types have access to useful methods
		  
//		  String name = "Bro";
		  
			//boolean result = name.equalsIgnoreCase("bro");
		  //int result = name.length();
		  //char result = name.charAt(0);
		  //int result = name.indexOf("o");
		  //boolean result = name.isEmpty();
		  //String result = name.toUpperCase();
		  //String result = name.toLowerCase();
		  //String result = name.trim();
		  //String result = name.replace('o', 'a');
		   
		  //System.out.println(result);
}

}
