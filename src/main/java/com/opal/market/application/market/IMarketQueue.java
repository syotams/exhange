package com.opal.market.application.market;

import com.opal.market.domain.models.order.Order;
import com.opal.market.domain.models.order.OrderSide;

import javax.validation.constraints.Null;

public interface IMarketQueue extends IQueue<Order> {

    NonBlockingTask<Order[]> getOrderBook(String symbol, OrderSide side);

    NonBlockingTask<Null> stats();

}
