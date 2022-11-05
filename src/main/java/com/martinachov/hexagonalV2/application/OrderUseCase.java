package com.martinachov.hexagonalV2.application;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.martinachov.hexagonalV2.domain.Orders;
import com.martinachov.hexagonalV2.infra.inputport.OrderInputPort;
import com.martinachov.hexagonalV2.infra.outputport.EntityRepository;

@Component
public class OrderUseCase implements OrderInputPort {
    
    @Autowired
    EntityRepository entityRepository;

    @Override
    public Orders createOrder(String customerId, BigDecimal total) {
        Orders order = Orders.builder()
            .id( UUID.randomUUID().toString() )
            .customerId( customerId )
            .total( total )
            .build();

        return entityRepository.save( order );
    }
    
}
