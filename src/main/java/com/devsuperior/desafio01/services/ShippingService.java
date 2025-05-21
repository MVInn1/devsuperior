package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){

        double valor = order.getBasic();

        if (valor < 100 ){
            return 20;
        }
        else if (valor < 200) {
            return 12;
        }
        else {
            return 0;
        }
    }
}
