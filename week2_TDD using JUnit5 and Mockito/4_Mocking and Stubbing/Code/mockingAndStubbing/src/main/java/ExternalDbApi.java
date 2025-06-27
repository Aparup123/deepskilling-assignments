import java.util.HashMap;
import java.util.Map;


public class ExternalDbApi {
	private Map<Integer, User> users=new HashMap<>();
	public void saveUser(User user) {
		if(users.containsKey(user.getId())) {
			throw new RuntimeException("User already exists.");
		}
		users.put(user.getId(), user); 
	}
	
	public User getUserById(int id) {
		if(!users.containsKey(id)) {
			return null;
		}
		return users.get(id);
	}
}
