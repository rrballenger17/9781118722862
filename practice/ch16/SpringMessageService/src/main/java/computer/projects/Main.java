package computer.projects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import computer.projects.beans.MockMessageService;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Starting...");

		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      
		final ApplicationContext context = 
                new ClassPathXmlApplicationContext(
                        "computer/projects/Context.xml");
				
		MockMessageService printer = context.getBean(MockMessageService.class);
		
	    System.out.println("\nthe message: " + printer.getMessage() + "\n");
   
	}

}
