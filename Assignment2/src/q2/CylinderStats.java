package q2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * <p>This program asks for the height and the radius 
 * of a cylinder and outputs volume and surface area.</p>
 *
 * @author Artem Jeman
 * @version 1.0
 */
public class CylinderStats {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.0000");
        
        /** the radius of the cylinder */
        double r; 
        /** the height of the cylinder */
        double h; 
        
        System.out.println("Enter the radius of the cylinder: ");
        r = scan.nextDouble();
        System.out.println("Enter the height of the cyinder: ");
        h = scan.nextDouble(); 
        
        /**the surface area of the cylinder */
        double sa = 2 * Math.PI * r * (r + h);
        /** the volume of the cylinder */
        double vol = Math.PI * Math.pow(r, 2) * h;
        
        System.out.println("The surface are of cylinder is: " + f.format(sa));
        System.out.println("The volume of the cylinder is: " + f.format(vol)); 
        
        scan.close();
    }

};
