package q5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * <p>This program draws a traffic light and uses a 
 * push button to change the state of the light.</p>
 *
 * @author Artem Jeman 
 * @version 1.0
 */
public class TrafficLight  extends JFrame {

    /**
     * <p> JFrame that sets the frame dientions.</p>
     */
    private static final long serialVersionUID = 1L;
    /** This is the button for the traffic light. */
    private JButton button;
    /**This is where the count starts. */
    private int count;
    /** The color of the top light. */
    private Color up;
    /** Color of the middle light. */
    private Color middle;
    /**Color of the bottom light. */
    private Color bottom;
    

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public TrafficLight() {
        super("MEGATRON");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button = new JButton("CHANGE LIGHT");
        JPanel panel = new JPanel();
        button.addActionListener(new TrafficLightListener()); 
        panel.add(button);
        panel.add(new DrawingPanel());
        
        /** the red value of rgb */
        final int red = 236;
        /** the green value of rgb */
        final int green = 118; 
        /** the blue value of rgb */
        final int blue = 0;
        
        panel.setBackground(new Color(red, green, blue));

        getContentPane().add(panel);
        
        /** the dimension */
        final int x = 200;
        /** the dimension*/
        final int y = 550;
        setSize(x, y);
        setVisible(true);
    }
    
    /** 
     * 
     * <p>This class draws the Panel in which everything is drawn.</p>
     *
     */
    class DrawingPanel extends JPanel {
        /**
         *<p> Quickfix.</p>
         */
        private static final long serialVersionUID = -1936027174564215297L;

        /**
         * <p>This method provides the panel that will drawn on.</p>
         */
        public DrawingPanel() {
            
            /** drawing panel dimension */
            final int a = 150;
            /** drawing panel dimension */
            final int a2 = 470;
            /** background color red */
            final int r = 236;
            /** background color green */
            final int g = 118;
            /** background color blue */
            final int b = 0;
            setPreferredSize(new Dimension(a, a2));
            setBackground(new Color(r, g, b));
            
        }
       
        /**
         * <p>This method paints the cicles of the trafficlight.</p>
         * @param g is the graphics paint component.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            /** circle one x component */
            final int c = 0;
            /** circle one y component */
            final int c1 = 0;
            /** circle one two and three diameter */
            final int diameter = 150;
            
            /** circle two x component */
            final int c2 = 0;
            /** circle two y component */
            final int c22 = 160;
           
            /** circle three x component */
            final int c3 = 0;
            /** circle three y component */
            final int c33 = 320;
          
            g.setColor(up);
            g.fillOval(c, c1, diameter, diameter);
            repaint();
           
            g.setColor(middle);
            g.fillOval(c2, c22, diameter, diameter);
            repaint();
            
            g.setColor(bottom);
            g.fillOval(c3, c33, diameter, diameter);
            repaint();
            g.setColor(Color.black);
            
        }
    }
    
    /**
     * 
     * <p> The class that implements ActionListener 
     * for every click of the button.</p>
     *
     */
    private class TrafficLightListener implements ActionListener {
        /**
         * 
         * <p> This method counts the clicks to choose the right
         *  color to show on the traffic light.</p>
         * @param event uses the click of the button.
         *
         */
        public void actionPerformed(ActionEvent event) { 
            
            if (count == 2) {
                up = Color.red;
                middle = Color.black;
                bottom = Color.black;
                count = -1;
                repaint();
                
              
            } else if (count == 1) {
                up = Color.black;
                middle = Color.yellow;
                bottom = Color.black;
                repaint();
                }
           
            if (count == 0) {
                up = Color.black;
                middle = Color.black;
                bottom = Color.green;
                repaint();
                }
           
           count++;                
        }    
    }

    /**
     * <p>The main method that calls the TrafficLight method.</p>
     * @param args unused.
     */
    public static void main(String[] args) {
        new TrafficLight();
    }
}
