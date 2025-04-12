package test_spring.test;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);
		System.out.println("Hello World!");
		System.out.println("개 좆같은 깃허브");
		System.out.println("temp");
	}

}
