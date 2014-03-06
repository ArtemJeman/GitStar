package q3;
/**
 * <p>This class contains instance data for title, 
 * author, publisher and copyright date. Bookshelf.java has the main 
 * method that uses this class.</p>
 *
 * @author Artem Jeman
 * @version 1.0
 */

public class Book {
    /** the title of the book. */
    private String title;
    /** the author of the book . */
    private String author;
    /** the publisher of the book.  */
    private String publisher;
    /** the copyright date of the book.  */
    private int copydate;
    
    /**
     * 
     * <p>Constructor method for the book.</p>
     * @param  atitle - title of the book
     * @param  aauthor - author of the book
     * @param  apublisher - author of the book  
     * @param  acopydate - copyright date of the book
     * 
     */
  public Book(String atitle, String aauthor, String apublisher, int acopydate) {
        title = atitle;
        author = aauthor; 
        publisher = apublisher; 
        copydate = acopydate;           
    }
    
    
    /**
     * 
     * <p> No - argument Constructor method for the book.</p>
     * 
     * 
     */
    public Book() {
        title = "";
        author = "";
        publisher = ""; 
        copydate = 0; 
    }
    
    /**
     * 
     * <p> This method gets the title.</p>
     * @return  title of the book.
     * 
     */
    public String getTitle() {
        return title;
         }
    
    /**
     * 
     * <p> This method sets the title.</p>
     * @param title - title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * 
     * <p> This method gets the Author name.</p>
     * @return author 
     * 
     */
    public String getAuthor() {
        return author;
         }
    
    /**
     * 
     * <p> This method sets the Author name.</p>
     * @param author - author of the book
     */
    public void setAuthor(String author) {
        this.author = author; 
         }
    
    /**
     * 
     * <p> This method gets the Publisher name.</p>
     * @return publisher
     */
    public String getPublisher() {
        return publisher;
         }
    
    /**
     * 
     * <p> This method sets the Publisher name.</p>
     * @param publisher - pubisher date.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    /**
     * 
     * <p> This method gets the Copyright Date.</p>
     * @return copydate
     * 
     */
    public int getCopydate() {
        return copydate;
        }
    
    /**
     * 
     * <p> This method gets the Publisher Date.</p>
     * @param copydate - copyright date.
     */
    public void setCopydate(int copydate) {
        this.copydate = copydate;
        
    }
    
    /**
     * 
     * <p> This method strings all the variables together.</p>
     * @return title then author then publisher then copydate
     */
    public String toString() {
        return  (title + "\n" + author  + "\n" + publisher  + "\n" + copydate);
    }
}


