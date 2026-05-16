package in.cs.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.cs.main.beans.Student;

@Configuration
public class javaConfig {
	
	@Bean
	public CommandLineRunner cmdliner() {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				stdBean().display();
			}
			
		};
		
	}

	@Bean
	public Student stdBean() {
		return new Student("chensingh",8,56.6f);
	}
	
}
