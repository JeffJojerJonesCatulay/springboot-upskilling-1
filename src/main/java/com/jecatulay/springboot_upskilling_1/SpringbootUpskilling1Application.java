package com.jecatulay.springboot_upskilling_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootUpskilling1Application {

	public static void main(String[] args) {
		// SpringApplication.run(SpringbootUpskilling1Application.class, args);
		
		OrderService orderService = new OrderService(new MayaPaymentService());
		orderService.placeorder(100.0);

		OrderService orderService2 = new OrderService(new GCashPaymentService());
		orderService2.placeorder(200.0);
	}

}
