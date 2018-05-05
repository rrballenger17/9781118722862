package computer.projects.beans;

import org.springframework.stereotype.Component;

import computer.projects.MessageService;

@Component
public class MockMessageService implements MessageService {

	@Override
	public String getMessage() {
		return "Mock service 1";
	}

}
