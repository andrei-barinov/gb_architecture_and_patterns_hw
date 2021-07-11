package ru.gb.app.data_mapper;


import ru.gb.app.exception.ResourceNotFoundException;
import ru.gb.app.model.Order;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class OrderIdentityMap {

  OrderMapper orderMapper;

  private final Map<Long, Order> orderMap = new HashMap<>();

  public OrderIdentityMap(OrderMapper orderMapper) {
    this.orderMapper = orderMapper;
  }

  public void addOrder(Order order) {
    orderMap.put(order.getId(), order);
  }

  public Order getOrder(Long id) throws SQLException {
    if (orderMap.get(id) == null) {
      addOrder(orderMapper.findById(id));
    } else {
      throw new ResourceNotFoundException("order not found");
    }
    return orderMap.get(id);
  }
}
