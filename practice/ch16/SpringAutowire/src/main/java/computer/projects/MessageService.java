package computer.projects;

import computer.projects.beans.MessageDictionary;

public interface MessageService {
    String getMessage();
    
    void changeMessage(String message); 
    
    

	
	public String getDictionaryMessage();
	
	//public MockMessageService(MessageDictionary dictionary);
	
}
