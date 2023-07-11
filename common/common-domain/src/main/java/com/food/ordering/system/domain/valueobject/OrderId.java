package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class OrderId<T> extends BaseId<UUID> {
    public OrderId(UUID value) {
        super(value);
    }
}
