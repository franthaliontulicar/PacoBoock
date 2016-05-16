
/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    // instance variables - replace the example below with your own
    private String nombreGrupo;
  

    public JoinGroupPost(String nombre)
    {
        super("xxx");
        nombreGrupo = nombre;
        

    }

    public String getNombreGrupo(){
        return nombreGrupo;
    }
    
    
}
