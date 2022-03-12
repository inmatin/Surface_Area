/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Leanne Seaward
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Oct 1st, 2021
 * Modified: Oct 1st, 2021
 * Description: This class will calculate the paintable surface area of a silo
 */
import java.util.Scanner;

public class SurfaceArea {

	public static void main(String[] args) {

		// declaration

		double height;
		double radius;
		double diameter;
		double radiussquare;
		double surfacearea;

		// adding the scanner input
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the height: ");
		height = input.nextDouble();

		System.out.print("Enter the diameter: ");
		diameter = input.nextDouble();

		// calculate radius
		radius = diameter / 2;

		// calculate radiusSquared
		radiussquare = Math.pow(radius, 2);

		// calculate the surfacearea
		surfacearea = (Math.PI * radiussquare) + (2 * Math.PI * radius * height);

		// rounding surfacearea
		surfacearea = Math.round(surfacearea);

		System.out.println();

		// Output the paintable surface area
		System.out.println("Surface Area = " + surfacearea);

		// Program created by user
		System.out.println("Program by Ishtiaque Matin");

		// closing input stream
		input.close();

	}

}
