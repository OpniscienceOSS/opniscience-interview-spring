package com.opniscience.interview.service;

import com.opniscience.interview.api.dto.OrderDto;
import com.opniscience.interview.persistence.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
  private final OrderRepository repository;

  public OrderService(OrderRepository repository) {
    this.repository = repository;
  }

  public OrderDto getOrder(UUID id) {
    return null;
  }

  public List<OrderDto> listOrders() {
    return List.of();
  }

  public OrderDto createOrder(OrderDto dto) {
    return null;
  }
}
