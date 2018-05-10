
import com.google.common.collect.*;
import java.util.*;
import static org.junit.Assert.*;

// javac -cp .:./* MultimapExample.java
// java -cp .:./* MultimapExample

class MultimapExample{  
    public static void main(String args[]){  

        final Multimap<String, String> mapping = HashMultimap.create();

    	mapping.put("17 High Street", "Alice Smith");
    	mapping.put("17 High Street", "Bob Smith");
    	mapping.put("3 Hill Lane", "Simon Anderson");

    	final Collection<String> smiths = mapping.get("17 High Street");
    	
    	assertEquals(2, smiths.size());

    	assertTrue(smiths.contains("Alice Smith"));

    	assertTrue(smiths.contains("Bob Smith"));

    	assertEquals(1, mapping.get("3 Hill Lane").size());

    	System.out.println("Expected output: Alice Smith and Bob Smith\n\n");

    	for(String name: smiths){
    		System.out.println(name);
    	}

    }  
}  


