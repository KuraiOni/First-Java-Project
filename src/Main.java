import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] arges) {

        // System.out.println("First Sentence");
        // System.out.println("Some Other Line\n");
        // System.out.println("Hello\n");

        //
        // // This a comment
        //
        // /*
        // * This is
        // * a comment
        // * with multiple
        // * lines
        // */
        //
        //
        // //Variables
        //
        // /*
        // * list of datatype:
        // * byte
        // * short
        // * float
        // * long
        // */
        //
        // int x = 23;
        // double y = 8.63765;
        // boolean value = true;
        // char wtvr = '@';
        // String sent = "This is a string";
        //
        // System.out.println(x);
        //
        //
        // // Swaping Variables
        //
        //
        // String X = "Water";
        // String Y = "Orange";
        // String temp;
        //
        // temp = X;
        // X = Y;
        // Y = temp;
        //
        // System.out.println("X: "+X);
        // System.out.println("Y: "+Y);
        //
        // // Scanner
        //
        // Scanner scanner = new Scanner(System.in);
        //
        // System.out.println("What is your name? ");
        // String name = scanner.nextLine();
        // System.out.println("How old are you? ");
        // int age = scanner.nextInt();
        // scanner.nextLine();
        // System.out.println("What is your favorite food? ");
        // String food = scanner.nextLine();
        //
        // System.out.println("Your name is "+name);
        // System.out.println("You are "+age+" years old");
        // System.out.println("Your favorite food is "+food);

        // GUI Interface

        // String id = JOptionPane.showInputDialog("Enter your name");
        // JOptionPane.showMessageDialog(null, "Hello "+id);
        // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        // JOptionPane.showMessageDialog(null, "You are "+age+" years old");
        // double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your
        // height "));
        // JOptionPane.showMessageDialog(null, "You are"+height+" cm tall");

        // Math Class

        // double X;
        // double Y;
        // double Z;
        //
        //
        // Scanner scanner = new Scanner(System.in);
        //
        // System.out.println("Enter the value of X: ");
        // X = scanner.nextDouble();
        // System.out.println("Enter the value of Y: ");
        // Y = scanner.nextDouble();
        //
        //
        // Z = Math.sqrt((X*X)+(Y*Y));
        //
        // System.out.println("The hypotrnus is: "+Z);
        //
        // scanner.close();

        // Random Class

        // Random random = new Random();
        //
        // int X = random.nextInt(10);
        // System.out.println(X);
        //
        // double Y = random.nextDouble();
        // System.out.println(Y);

        // if Statements

        // Scanner scanner = new Scanner(System.in);
        //
        // System.out.println("What is your name? ");
        // String X = scanner.nextLine();
        // System.out.println("How old are you? ");
        // double Y = scanner.nextDouble();
        // scanner.nextLine();
        // System.out.println("How tall are you? ");
        // double Z = scanner.nextDouble();
        // scanner.nextLine();
        //
        //
        // System.out.println("Your name is: "+X);
        // System.out.println("You are "+Y+" years old");
        // System.out.println("You are "+Z+" cm tall");
        //
        // scanner.close();
        //
        //
        // if(Y>=18 && Z>=175) {
        // System.out.println("You are to be in the back");
        // }
        // else if(Y>=13 && Z>=165) {
        // System.out.println("You are to be in the middle");
        // }
        // else {
        // System.out.println("You are to be in the front");
        // }

        // switch = statement that allows a variable to be tested for equality against a
        // list of values

        // String day = "Friday";
        //
        // switch(day) {
        // case "Sunday": System.out.println("It is Sunday!");
        // break;
        // case "Monday": System.out.println("It is Monday!");
        // break;
        // case "Tuesday": System.out.println("It is Tuesday!");
        // break;
        // case "Wednesday": System.out.println("It is Wednesday!");
        // break;
        // case "Thursday": System.out.println("It is Thursday!");
        // break;
        // case "Friday": System.out.println("It is Friday!");
        // break;
        // case "Saturday": System.out.println("It is Saturday!");
        // break;
        // default: System.out.println("That is not a day!");
        // }

        // While Loops

        // Scanner scanner = new Scanner(System.in);
        // String name = "";
        //
        //
        // while(name.isBlank()) {
        // System.out.println("Enter your name: ");
        // name = scanner.nextLine();
        // }
        //
        // System.out.println("Your name is: "+name);
        //
        // do{
        // System.out.println("Enter your name: ");
        // name = scanner.nextLine();
        // }while(name.isBlank()) ;
        //
        // System.out.println("Your name is: "+name);

        // For loops

        // for(int i=0; i<=10; i++ ) {
        // System.out.println(i);
        // }
        //
        // System.out.println("Hello");
        //
        // for(int i=10; i>=0; i--) {
        // System.out.println(i);
        // }

        // Nested Loopes

        // Scanner scanner = new Scanner(System.in);
        // int rows;
        // int columns;
        // String symbol = "";
        //
        //
        // System.out.println("Enter the number of rows: ");
        // rows = scanner.nextInt();
        // System.out.println("Enter the number of columns: ");
        // columns = scanner.nextInt();
        // System.out.println("Enter the symbol: ");
        // symbol = scanner.next();
        //
        // for(int i=1; i<=rows; i++) {
        // System.out.println();
        // for(int j=1; j<=columns; j++) {
        // System.out.print(symbol);
        // }
        // }

        // Arrays

        // String[] cars = new String[3];
        //
        // cars[0] = "tesla";
        // cars[1] = "mustang";
        // cars[2] = "camaro";
        //
        // for(int i=0; i<cars.length; i++) {
        // System.out.println(cars[i]);
        // }

        // 2D array = an array of arrays

        // String[][] cars = {
        // {"Camaro","Corvette","Silverado"},
        // {"Mustang","Ranger","F-150"},
        // {"Ferrari","Lambo","Tesla"}
        // };
        //
        // /*
        // cars[0][0] = "Camaro";
        // cars[0][1] = "Corvette";
        // cars[0][2] = "Silverado";
        // cars[1][0] = "Mustang";
        // cars[1][1] = "Ranger";
        // cars[1][2] = "F-150";
        // cars[2][0] = "Ferrari";
        // cars[2][1] = "Lambo";
        // cars[2][2] = "Tesla";
        // */
        //
        // for(int i=0; i<cars.length; i++) {
        // System.out.println();
        // for(int j=0; j<cars[i].length; j++) {
        // System.out.print(cars[i][j]+" ");
        // }
        // }

        // reference data types have access to useful methods

        // String name = "Bro";

        // boolean result = name.equalsIgnoreCase("bro");
        // int result = name.length();
        // char result = name.charAt(0);
        // int result = name.indexOf("o");
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim();
        // String result = name.replace('o', 'a');

        // System.out.println(result);

        // wrapper class = provides a way to use primitive data types as reference data
        // types
        // reference data types contain useful methods
        // can be used with collections (ex.ArrayList)

        // primitive //wrapper
        // --------- //-------
        // boolean Boolean
        // char Character
        // int Integer
        // double Double

        // autoboxing = the automatic conversion that the Java compiler makes between
        // the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class
        // to primitive

        // Boolean a = true;
        // Character b = '@';
        // Integer c = 123;
        // Double d = 3.14;

        // Array List

        // ArrayList<String> food = new ArrayList<String>();
        // food.add("pizza");
        // food.add("hamburger");
        // food.add("pasta");
        //
        // ArrayList<String> water = new ArrayList<String>();
        // water.add("pizza");
        // water.add("hamburger");
        // water.add("pasta");
        //
        //
        // ArrayList<ArrayList<String>> List = new ArrayList();
        //
        // List.add(food);
        // List.add(water);
        //
        //
        //
        // System.out.println(List.get(0).get(1));

        // For-Each Loop

        // ArrayList<String> animals = new ArrayList<String>();
        //
        // animals.add("Cat");
        // animals.add("Dog");
        // animals.add("Rat");
        // animals.add("Bird");
        //
        // for(String i : animals) {
        // System.out.println(i);
        // }

        // printf() = an optional method to control, format, and display text to the
        // console window
        // two arguments = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        // boolean myBoolean = true;
        // char myChar = '@';
        // String myString = "Bro";
        // int myInt = 50;
        // double myDouble = 1000;

        // [conversion-character]
        // System.out.printf("%b",myBoolean);
        // System.out.printf("%c",myChar);
        // System.out.printf("%s",myString);
        // System.out.printf("%d",myInt);
        // System.out.printf("%f",myDouble);

        // [width]
        // minimum number of characters to be written as output
        // System.out.printf("Hello %10s",myString);

        // [precision]
        // sets number of digits of precision when outputting floating-point values
        // System.out.printf("You have this much money %.1f",myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        // System.out.printf("You have this much money %,f",myDouble);

        // Final keyword

        // final double pi = 3.14;
        //
        // System.out.println(pi);

        // OOP + Constructers

        OOP human = new OOP("Rock", 60, 80);
        OOP human1 = new OOP("Martin", 70, 88);

        OOP[] body = { human, human1 };

        // System.out.println(human1.age);

        // human.eat();
        // human1.drink();

        // toString Method

        // System.out.println(body[1].name);

        Garage garage = new Garage();
        car mach = new car("toyota");

        // Garage.park(mach); // using the static
        // human1.park(mach); // non static

        // static creates a single copy of anything and allows for sharing

        /*
         * when you type extends while defining the class, the name of class you type
         * after it is the father in which this class will inherit the code from
         * 
         * When overriding it's best practice to put
         * 
         * @override
         * before it
         */

        Hero hero = new Hero("Batman", 44, "$$$");

        // super sends the info back to the parent

        System.out.println(hero.toString());

        // abstract = abstract classes cannot be instantiated, but they can have a
        // subclass
        // abstract methods are declared without an implementation
        // it forces the subclass to override the method

        /*
         * Access Modifiers
         * 
         * default(not writing anything):
         * Classes only in the same package can access the content of the class
         * 
         * Public: Makes it visible and accessible for every class
         * 
         * protected: only its sub classes can access its contents
         * 
         * private: everything in the same class are only able to access the content
         * 
         */

    }

}
