package computer.projects;

import org.springframework.stereotype.Component;

@Component
public class MockMessageService implements MessageService {

	@Override
	public String getMessage() {
		return "Mock service 1";
	}

}
