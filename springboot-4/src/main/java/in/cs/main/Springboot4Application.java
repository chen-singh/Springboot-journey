package in.cs.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.cs.main.beans.Student;

@SpringBootApplication
public class Springboot4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springboot4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		stdBean().display();
	}
	@Bean
	public Student stdBean() {
		return new Student("chensingh",8,56.6f);
	}

}
