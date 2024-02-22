package ahmad.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

		public static void main(String[] args) {
			//Print out to Console
			System.out.println("ello world!");

			//Create POJO and call function
			SendMessage msg = new SendMessage();
			System.out.println(msg.sendMessage());
		}


}
