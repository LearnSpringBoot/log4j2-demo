package in.learnspringboot;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4j2DemoApplication implements CommandLineRunner {
	
	private static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		SpringApplication.run(Log4j2DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		this method is to show the logger use
		System.out.println("This will see on console");
		logger.debug("this will save in log file");
		
		
		
	}
}
