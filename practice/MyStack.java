
import java.util.*;

class MyStack<T>{  


	private List<T> list = new LinkedList<T>();

	// pop
	public T pop(){

		T item = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return item;
	}


	// push 
	public void push(T item){

		list.add(item);
	}


	// peek 
	public T peek(){

		T item = list.get(list.size() - 1);
		return item;
	}



	// is empty 
	public boolean isEmpty(){
		return list.size() == 0;
	}

    public static void main(String args[]){  
     	System.out.println("Hello Java");

     	MyStack<String> test = new MyStack<String>();

     	test.push("Hello");

     	test.push("World");

     	if(test.isEmpty()){
     		System.out.println("ERROR");
     	}

     	System.out.println("peek: " + test.peek());

     	System.out.println("pop: " + test.pop());

     	System.out.println("pop: " + test.pop());

     	if(test.isEmpty()){
     		System.out.println("Empty!");
     	}

    }  

} 