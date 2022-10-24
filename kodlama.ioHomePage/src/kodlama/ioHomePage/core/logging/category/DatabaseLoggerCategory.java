package kodlama.ioHomePage.core.logging.category;

public class DatabaseLoggerCategory implements LoggerCategory{

	@Override
	public void logCategory(String data) {
		System.out.println("Veri tabanına loglandı: "+ data);		
	}

}
