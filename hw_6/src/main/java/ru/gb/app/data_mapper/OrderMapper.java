package ru.gb.app.data_mapper;


import ru.gb.app.exception.ResourceNotFoundException;
import ru.gb.app.model.Order;
import ru.gb.app.service.OrderService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class OrderMapper {

  OrderService orderService;
  private final Connection connection;

  public OrderMapper(Connection connection) {
    this.connection = connection;
  }

  public Order findById(Long id) throws SQLException {
    PreparedStatement statement = connection.prepareStatement(
        "SELECT ID, CREATED_AT FROM ORDER WHERE ID = ?");
    statement.setLong(1, id);
    try (ResultSet resultSet = statement.executeQuery()) {
      while (resultSet.next()) {
        Order order = new Order();
        order.setId(resultSet.getLong(1));
        order.setOwner(orderService.GetServiceManagerByDocument(resultSet.getInt(1)));
        order.setCreatedAt(LocalDateTime.parse(resultSet.getString(3)));
        return order;
      }
    }
    throw new ResourceNotFoundException(id);
  }
}

