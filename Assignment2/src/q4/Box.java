package q4;
/**
 * <p>This class contains instance data for the height, 
 * the depth, the width and the fullness of the box . BoxTest.java has the main 
 * method that uses this class.</p>
 *
 * @author Artem Jeman
 * @version 1.0
 */

public class Box {
    /** the height of the box. */
    private int h;
    /** the width of the box. */
    private int w;
    /** the depth of the box. */
    private int z;
    /** the variable that represents whether the box is full or not. */
    private boolean full;
    
    /**
     * 
     * <p> No - argument Constructor method for the box.</p>
     * 
     * 
     */
    public Box() {
        h = 0;
        w = 0; 
        z = 0;
        full = false;    
    }
    
    
    /**
     * 
     * <p> This method gets the height of the box.</p>
     * @return  h - height of the box.
     * 
      */
    public int getH() {
        return h;    
    }
    
    
    /**
     * 
     * <p> This method sets the height of the box.</p>
     * @param h - height of the box.
     */
    public void setH(int h) {
       this.h = h; 
    }
    
    
    /**
     * 
     * <p> This method gets the title.</p>
     * @return  w - with of the box.
     * 
      */
    public int getW() {
        return w;    
    }
    
    /**
     * 
     * <p> This method sets the width of the box.</p>
     * @param w - width of the box.
     */
    public void setW(int w) {
       this.w = w; 
    }
    
    /**
     * 
     * <p> This method gets the depth of the box.</p>
     * @return  z - depth of the box.
     * 
      */
    public int getZ() {
        return z;    
    }
    
    /**
     * 
     * <p> This method sets the depth of the box.</p>
     * @param z - depth of the box.
     */
    public void setZ(int z) {
       this.z = z; 
    }
    
    
    /**
     * 
     * <p> This method returns whether the box is full or not.</p>
     * @return  full - true or false.
     * 
      */
    public boolean getFull() {
        return full;    
    }
    
    /**
     * 
     * <p> This method sets true/false if the box is full.</p>
     * @param full - whether the box is full or not.
     */
    public void setFull(boolean full) {
       this.full = full; 
    }
    
    /**
     * 
     * <p> This method strings all the variables together.</p>
     * @return h then w then z then full
     */
    public String toString() {
        return  ("The Height: " + h + " The Width: " + w  + " The Depth: "
        + z  + " Full? " + full);
    }
}
