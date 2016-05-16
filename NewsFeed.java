
import java.util.ArrayList;

/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    // private ArrayList<MessagePost> messages;
    //private ArrayList<PhotoPost> photos;
    //private ArrayList<JoinGroupPost> grupos;
    private ArrayList<Post> post;
    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        //messages = new ArrayList<>();
        //photos = new ArrayList<>();
        //grupos = new ArrayList<>();
        post = new ArrayList<>();
    }

    public void addPost(Post postIt){
        post.add(postIt);

    }

    /**
     * Show the post
     */
    public void show(){
       /** for(MessagePost message : messages){
            message.display();
        }
        for(PhotoPost photo : photos){
            photo.display();
        }
        for(JoinGroupPost group : grupos){
            group.display();
        }*/
        for(Post post: post){
            post.display();
        }
    }
}

