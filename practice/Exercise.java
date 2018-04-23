
//Demonstrating Factorials

public class Exercise {

	public static Long factorial(Long x){

		if(x == 0){
			return (long) 1;
		}

		return factorial(x - 1) * x;
	}

   public static void main(String []args) {

   		System.out.println(factorial(Long.parseLong(args[0])));

   }


}





//ch7 -  Demonstrating Factorials

//ch8 - the primitive types

