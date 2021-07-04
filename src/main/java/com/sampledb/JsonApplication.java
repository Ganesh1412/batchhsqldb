package com.sampledb;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sampledb.domain.Data;
import com.sampledb.service.DataService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class JsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(DataService dataService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Data>> typeReference = new TypeReference<List<Data>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/sample.json");
			try {
				List<Data> datas = mapper.readValue(inputStream,typeReference);
				dataService.save(datas);
				System.out.println("Json Data Saved!");
			} catch (IOException e){
				System.out.println("Unable to save json data: " + e.getMessage());
			}
	    };
	}
}
