package com.axis.batch197;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;

//import com.axis.batch197.audit.AuditorAwareImp;

@SpringBootApplication
public class Registration6Application {

	public static void main(String[] args) {
		SpringApplication.run(Registration6Application.class, args);
	}
//	
//	@Bean
//    public AuditorAware<String> auditorAware() {
//        return new AuditorAwareImp();
//    }

}
