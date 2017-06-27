package grand.circus;
import java.util.Scanner;
public class Main {


       // public class not specific Main was used
            public static void main (String [] args) {

                Scanner scnr = new Scanner(System.in);
                double length = 0.0;
                double width = 0.0;
                double volume = 0.0;
                double area = 0.0;
                double height = 0.0;
                double perimeter = 0.0;
                // can't use char, because no scnr.nextChar ()
                char userChar = '-';
                String userInput = "" ;

                System.out.println( "Welcome to Grand Circus' Room Detail Generator!");
                System.out.println (" ");
                while (userChar != 'n') { // userChar == didn't work so used !=


                    System.out.print("Enter classroom value of length: ");
                   length = scnr.nextDouble();

                    System.out.print("Enter classroom value of width: ");
                    width = scnr.nextDouble();

                    area = length * width;

                    volume = area * height;

                    perimeter = (2 * length) + (2 * width);

                    System.out.println("Area: " + area);

                    System.out.println("Perimeter: " + perimeter);

                    System.out.println (" ");

                    System.out.print("Continue? (y/n): "  );
                    userInput = scnr.next();
                    userChar = userInput.charAt(0); // Get the first char in the String

                    System.out.println (" ");

                }
                return;
            }
        }// write your code here
