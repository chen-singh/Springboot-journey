package in.cs.main;

import org.springframework.stereotype.Component;

@Component
public class Myclass {

	public void printMsg(String name) {
		System.out.print("hello "+name);
	}
}
