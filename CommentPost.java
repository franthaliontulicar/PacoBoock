
import java.util.ArrayList;
/**
 * Write a description of class CommentPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommentPost extends Post
{
    // instance variables - replace the example below with your own
     private ArrayList<String>comments;

    /**
     * Constructor for objects of class CommentPost
     */
    public CommentPost()
    {
      
       super("xxx");   
       comments = new ArrayList<>();
    
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addComents(String comment)
    {
        comments.add(comment);
    }
}