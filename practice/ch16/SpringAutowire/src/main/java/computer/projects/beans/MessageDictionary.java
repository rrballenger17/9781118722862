package computer.projects.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class MessageDictionary {
	
	public String getWelcomeMessage() {
		return "Welcome to California!";
	}

}
