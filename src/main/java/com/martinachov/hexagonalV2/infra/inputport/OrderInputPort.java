package com.martinachov.hexagonalV2.infra.inputport;

import java.math.BigDecimal;

import com.martinachov.hexagonalV2.domain.Orders;

public interface OrderInputPort {
    public Orders createOrder( String customerId, BigDecimal total );
}
