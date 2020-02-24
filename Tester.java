import java.util.*;
import java.lang.*;

public class Tester{
    public static void main (String argv[])
    {
       Person lucas = new Person(15, "Lucas");
       Person sophie = new Person(21, "Sophie");
       Person simone = (Person)sophie.clone();

       System.out.println(lucas);
       System.out.println(sophie);
       System.out.println(simone);
 
    }
 }