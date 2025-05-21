package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public double total(Order order){

        double discount = order.getBasic() * (order.getDiscount()/100);
        return order.getBasic() - discount;

    }
}
