
public class MailService {
	private MailApi api;
	public MailService(MailApi api) {
		this.api=api;
	}
	void send(String recieverMail, String content) {
		if(content.isEmpty()) {
			return;
		}
		api.sendMail(recieverMail, content);
	}
}
