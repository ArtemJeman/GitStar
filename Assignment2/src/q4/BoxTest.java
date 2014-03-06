
package q4;


/**
 * <p>BoxTest class uses the constructors and assisting methods from the 
 * class Box.java to write out the dimensions of the box. </p>
 *
 * @author Artem Jeman
 * @version 1.0
 */
public class BoxTest {
    /**
    * <p>This is the main method (entry point) that gets called by the JVM.</p>
    *
    * @param args unused.
    */
    public static void main(String[] args) {
        /** box1 dimensions */
        final int boxa = 10;
        /** box2 dimensions */
        final int boxb = 11;
        
        final Box box1 = new Box();
        box1.setH(boxa);
        box1.setW(boxa);
        box1.setZ(boxa);
       
        final Box box2 = new Box();
        box2.setH(boxb);
        box2.setW(boxb);
        box2.setZ(boxb);
        box2.setFull(true);
       
        System.out.println("The Height " + box1.getH() + " The WIdth " 
        + box1.getW() + " The Depth " + box1.getZ() + " Full? " 
        + box1.getFull());
        System.out.println(box2.toString());
        
    }

}
