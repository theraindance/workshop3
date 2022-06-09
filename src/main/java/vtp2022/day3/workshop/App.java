// snow_@LAPTOP-QE611BQ0 MINGW64 ~/Documents/work3/workshop3
// $ mvn compile exec:java -Dexec.mainClass="vtp2022.day3.workshop.App"

package vtp2022.day3.workshop;

/**
 * Hello world!
 *
 */
public class App 
{
    private static String defaultDb= "db";
    public static void main( String[] args )
    {
        // print out first argument db name use to create the directory
        if(args.length > 0)
            if(args[0] != null){
                System.out.println( args[0] );
                App.defaultDb = args[0];
            }
        System.out.println( defaultDb );
         Repository repo = new Repository(defaultDb);
         Session session = new Session(repo);
         session.start();
    }
}