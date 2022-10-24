package kodlama.ioHomePage.core.logging.category;

public class FileLoggerCategory implements LoggerCategory {

	@Override
	public void logCategory(String data) {
		System.out.println("Dosyaya loglandı: "+ data);	
		
	}

}
