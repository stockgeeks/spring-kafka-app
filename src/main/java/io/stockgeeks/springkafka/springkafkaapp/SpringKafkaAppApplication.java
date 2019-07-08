package io.stockgeeks.springkafka.springkafkaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class SpringKafkaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaAppApplication.class, args);
	}

}
