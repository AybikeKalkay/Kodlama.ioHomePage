package kodlama.ioHomePage.core.logging.category;

public class MailLoggerCategory implements LoggerCategory {

	@Override
	public void logCategory(String data) {
		System.out.println("Mail gönderildi: "+ data);	
		
	}

}
