package com.food.ordering.system.order.service.domain.utils;

public class Constants {

    public static final String ORDER_BAD_INIT_STATE = "Order is not in the correct state for initialization";
    public static final String ORDER_BAD_PAY_STATE = "Order is not in the correct state for pay operation!";
    public static final String ORDER_BAD_CANCELLING_STATE = "Order is not in the correct state for initCancel operation!";
    public static final String ORDER_BAD_CANCEL_STATE = "Order is not in the correct state for cancel operation!";

    public static final String ORDER_BAD_APPROVE_STATE = "Order is not in the correct state for approve operation!";
    public static final String ORDER_PRICE_ZERO = "Total price must be greater than zero";

    public static final String ORDER_INITIATED = "Order with id {} is initiated";
    public static final String ORDER_PAID = "Order with id {} is paid";
    public static final String ORDER_APPROVED = "Order with id {} is approved";
    public static final String ORDER_CANCELLING = "Order payment is cancelling for order id {}";
    public static final String ORDER_CANCELLED = "Order with id {} is cancelled";

}
