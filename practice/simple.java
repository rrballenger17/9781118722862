

// Write an algorithm that prints all numbers between 1 and n, replacing multiples of 3 with the StringFizz, multiples of 5 with Buzz, and multiples of 15 with FizzBuzz.

class Simple{  
    public static void main(String args[]){  

    	if(args.length < 1){
    		return;
    	}

    	int n = Integer.parseInt(args[0]);
    
    	for(int i=1; i<=n; i++){

    		String output = i + "";

    		if(i % 15 == 0){
    			output = "FizzBuzz";
    		}else if(i % 5 == 0){
    			output = "Buzz";
    		}else if(i % 3 ==0){
    			output = "Fizz";
    		}

    		System.out.println(output);

    	}
    }  
}  




