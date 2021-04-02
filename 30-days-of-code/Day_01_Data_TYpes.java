import java.util.Scanner;
public class Day_01_Data_Types {
    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        
        int i = 4;
double d = 4.0;
String s = "HackerRank ";

//Declare second integer, double, and String variables.

int integer = input.nextInt();
double doubleNum =input.nextDouble();
String stringVar = input.nextLine();

//Read and save an integer, double and String to your variables.

//Print the sum of both integer variables on a new line.
System.out.println( i + integer);

//Print the sum of the double variables on a new line.
System.out.printf( "%.1f\n" , (d + doubleNum));

//Concatenate and print the String variables on a new line.
System.out.println ( s + stringVar);

//The 's' variable above should be printed first.

    }
} 


