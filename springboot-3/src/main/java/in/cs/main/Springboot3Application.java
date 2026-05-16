package in.cs.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springboot3Application  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Springboot3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		myclas().printMsg("chen");
	}
	@Bean
	public Myclass myclas() {
		
		return new Myclass();
		
	}

}
