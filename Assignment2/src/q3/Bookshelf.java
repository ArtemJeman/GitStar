package q3;


/**
 * <p>This is the class that contains the main method that prints out the 
 * author,title, publisher and the copyright date of a book. 
 * This class uses the constructor classes and assisting method
 *  from the Book.java class.</p>
 *
 * @author Artem Jeman
 * @version 1.0
 */
public class Bookshelf {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args unsused.
     */
    public static void main(String[] args) {
        
        final Book book1 = new Book("Harry Potter", "JK Rowling",
                "VanCityTimes", 1990);
        final Book book2 = new Book("Into The WIld", "Bryan The Second",
                "Penguin Publications", 1993);
        final Book book3 = new Book();
        
        /** magic number for the setCopydate method() */
        final int copydate = 1994;
        
        book3.setTitle("Welcome To The Jungle");
        book3.setAuthor("Gerald The Third");
        book3.setPublisher("Penguin Publications");
        book3.setCopydate(copydate);
        
        System.out.println();
        System.out.println(book1.toString());
        System.out.println();
        System.out.println(book2.toString());
        System.out.println();
        System.out.println(book3);
    
    }
}
