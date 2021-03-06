package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		var ctx = SpringApplication.run(DemoApplication.class, args);
//		System.out.println("Count: " + ctx.getBeanDefinitionCount());
//		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));

		ClientRepository repository = ctx.getBean(ClientRepository.class);
		repository.addClient(new Client("Ivan", BigInteger.valueOf(112233)));
		repository.addClient(new Client("Petr", BigInteger.valueOf(445566)));
	}

}
