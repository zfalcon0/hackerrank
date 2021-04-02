import java.util.Scanner;
import java.lang.Math;

//Complete the solve function below
public class Day_02_Oprators{
public static void solve(double meal_cost, int tipp , int tax_percent){
    double tip = meal_cost * ( tipp / 100 );
    double tax = meal_cost * ( tax_percent / 100 );
    int totalCost = (int)Math.round( meal_cost + tip + tax );

    System.out.println( totalCost );

}
public static void main (String args []){
    Scanner input = new Scanner (System.in);
    double meal_cost = input.nextDouble();

    int tip_percent = input.nextInt();

    int tax_percent = input.nextInt();

    solve(meal_cost, tip_percent, tax_percent);
}
}