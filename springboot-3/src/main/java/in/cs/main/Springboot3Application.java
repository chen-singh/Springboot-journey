package in.cs.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot3Application //implements CommandLineRunner
{

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Springboot3Application.class, args);
       Myclass m=  context.getBean(Myclass.class);
	  m.printMsg("Rana Chen Singh");
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		myclas().printMsg("chen");
//	}
//	@Bean
//	public Myclass myclas() {
//		
//		return new Myclass();
//		
//	}

}
