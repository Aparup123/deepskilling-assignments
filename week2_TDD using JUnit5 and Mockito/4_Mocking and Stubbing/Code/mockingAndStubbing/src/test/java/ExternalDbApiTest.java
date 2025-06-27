import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

class ExternalDbApiTest {
	
	// Mocking external api
	ExternalDbApi mockApi=mock(ExternalDbApi.class);
	
	// Creating userService
	UserService userService=new UserService(mockApi);
	
	@Test
	void getUserbyIdTest() {
		// Creating mock user
		User u1=new User(1, "John Doe", "johndoe@gmail.com");
		// Stubbing External API.
		when(mockApi.getUserById(1)).thenReturn(u1);
		User actualUser=userService.getById(1);
		// Asserting user name
		assertEquals(u1.getName(), actualUser.getName());
	}
	

	@Test
	void duplicateUserSaveTesting() {
		// Creating mock user
		User u1=new User(1, "John Doe", "johndoe@gmail.com");
		
		// User already exists
		doThrow(RuntimeException.class).when(mockApi).saveUser(u1);
		
		// Asserting exception
		assertThrows(RuntimeException.class, ()->{
			userService.save(u1);
		});
	}

}
