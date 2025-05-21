package com.devsuperior.desafio01;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;
import com.devsuperior.desafio01.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

public class Desafio01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1034,95.90,0);
		OrderService orderService = new OrderService();
		ShippingService shippingService = new ShippingService();

		double valorTotal = orderService.total(order) + shippingService.shipment(order);

		System.out.println("Código do produto: " + order.getCode());
		System.out.println("Valor total: " + valorTotal);

	}
}
