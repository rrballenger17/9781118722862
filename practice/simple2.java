
// Demonstrating the Fibonacci Sequence
// That is, given a value n, the method will return a list, in order, of the Fibonacci sequence to n. 

import java.util.List;
import java.util.ArrayList;

class Simple{


	public static List<Integer> fibonacci(int n){

		List<Integer> list = new ArrayList<Integer>();

		if(n > 0){
			list.add(0);
		}

		if( n > 1){
			list.add(1);
		}

		n = n - 2;

		while(n > 0){
			int size = list.size();
			int a = list.get(size -1);
			int b = list.get(size - 2);

			list.add(a + b);

			n--;

		}

		return list;

	}




	public static void main(String args[]){


		if(args.length == 0){
			return;
		}

		List<Integer> list = fibonacci(Integer.parseInt(args[0]));

		for(int x: list){

			System.out.println(x);
		}








	}






}







