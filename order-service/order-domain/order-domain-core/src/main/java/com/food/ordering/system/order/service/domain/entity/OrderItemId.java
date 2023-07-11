package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.valueobject.BaseId;
import com.food.ordering.system.domain.valueobject.OrderId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(long value) {
        super(value);
    }
}
