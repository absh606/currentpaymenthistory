package com.tsys.billings.paymenthistory.currentpaymenthistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CurrentpaymenthistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrentpaymenthistoryApplication.class, args);
	}

}
