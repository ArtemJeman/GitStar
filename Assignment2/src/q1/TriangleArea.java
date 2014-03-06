package q1;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * <p>This program figures out the area and the perimeter of a triangle.</p>
 *
 * @author Artem Jeman
 * @version 1.0
 */
public class TriangleArea {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.000");
        /** the first length that the user inputs */
        double x;
        /** the second length that the user inputs */
        double y;
        /** the third length that the use inputs */
        double z; 
        
        System.out.println("Enter the first length of the triangle");
        x = scan.nextDouble();
        System.out.println("Enter the second length of the triangle");
        y = scan.nextDouble();
        System.out.println("Enter the third length of the triangle");
        z = scan.nextDouble();
        
        /** the perimeter equation */
        double perimeter = x + y + z;
        /** the area calculation/equation */
        double s = perimeter / 2;
        
        System.out.println("The perimeter is: " + f.format(perimeter));
        
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        
        System.out.println("The area of the triangle is: " + f.format(area));
        
        scan.close();
    }

};
