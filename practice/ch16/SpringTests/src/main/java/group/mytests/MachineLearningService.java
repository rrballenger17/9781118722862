package group.mytests;

import org.springframework.stereotype.Service;

@Service("ml")
public class MachineLearningService implements DataModelService {

	public boolean isValid(String input) {
		return true;
	}

}
