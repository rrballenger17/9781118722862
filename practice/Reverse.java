
import java.util.*;

public class Reverse {
   
	

	public static void main(String []args) {
      // Following statement would create an object myPuppy

		if(args.length != 1){
			System.out.println("Error: arguement must be one word");
			System.exit(1);
		}

		String result = "";

		String target = args[0];

		for(int i=0; i<target.length(); i++){
			result =  ("" + target.charAt(i)) + result;
		}

		System.out.println(result);

	}

}


