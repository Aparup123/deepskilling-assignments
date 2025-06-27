public class UserService {
	private ExternalDbApi db;
	
	UserService(ExternalDbApi api){
		 db=api;
	}
	
	public User getById(int id) {
		return db.getUserById(id);
	}
	
	public void save(User user) {
		db.saveUser(user);
	}
}
