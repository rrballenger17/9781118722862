package computer.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Starting...");
		
    		ApplicationContext context = 
    	    	   new AnnotationConfigApplicationContext(SpringJavaConfiguration.class);
    	
    		MessageService printer = context.getBean(MockMessageService.class);

	    System.out.println("\nthe message: " + printer.getMessage() + "\n");
   
	}

}
