import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
public class MailApiTest {
	
	// Creating mock of the API
	MailApi mockApi=mock(MailApi.class);
	MailService mailService=new MailService(mockApi);
	
	@Test
	void sendingMailWithContentTest() {
		// Sending mail with content.
		mailService.send("johndoe@gmail.com", "Hello there");
		// api.sendMail() invoked once.
		verify(mockApi, times(1)).sendMail("johndoe@gmail.com", "Hello there");
	}
	
	@Test
	void sendingMailWithoutContentTest() {
		// Sending mail with content.
		mailService.send("johndoe@gmail.com", "");
		// api.sendMail() should not be invoked.
		verify(mockApi, never()).sendMail("johndoe@gmail.com", "");
	}
}
