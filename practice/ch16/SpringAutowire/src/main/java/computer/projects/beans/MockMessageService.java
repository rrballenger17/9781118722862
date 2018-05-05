package computer.projects.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import computer.projects.MessageService;

@Scope("prototype")
@Component
public class MockMessageService implements MessageService {
	
	private String message = "Mock service 1";
	
	private MessageDictionary dictionary;

	public void changeMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getDictionaryMessage() {
		if(!dictionary.equals(null)) {
			return dictionary.getWelcomeMessage();
		}
		
		return "";
	}

	@Autowired
	public MockMessageService(MessageDictionary dictionary) {
		this.dictionary = dictionary;
	}
}
