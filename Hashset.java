import java.util.*;
import java.util.Iterator;
public class Hashset
{
public static void main(String[] args) 
{
 HashSet<String> hset = new HashSet<String>();
		   // use add() method to add values in the hash set
		          hset.add("Red");
		          hset.add("Green");
		          hset.add("Black");
		          hset.add("White");
		          hset.add("Pink");
		          hset.add("Yellow");
		    System.out.println("Original Hash Set: " + hset);
		    System.out.println("Size of the Hash Set: " + hset.size());
}
}