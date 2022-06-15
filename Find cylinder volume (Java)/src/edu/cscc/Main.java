package edu.cscc;
import java.lang.Math;
import java.util.Scanner;
/*
Jonah Young
8/27/2019
Find the volume of a cylinder.
*/
public class Main {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
	    double radius, height, volume;
	    System.out.print("Enter the radius of the cylinder:");
	    radius = input.nextDouble();
	    System.out.print("Enter the height of the cylinder:");
	    height = input.nextDouble();
	    volume = Math.PI*(radius*radius)*height;
	    System.out.println("The volume of the cylinder is: "+volume);
    }
}
