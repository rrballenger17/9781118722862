package computer.projects.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import computer.projects.MessageService;

@Scope("prototype")
@Component
public class MockMessageService implements MessageService {
	
	private String message = "Mock service 1";

	@Override
	public void changeMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}



}
