package com.opniscience.interview.service;

import com.opniscience.interview.api.dto.OrderDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class OrderServiceTest {
  @Autowired
  private OrderService service;

  @Test
  void getOrderReadsFromDatabase() {
    OrderDto order = this.service.getOrder(UUID.fromString("00000000-0000-0000-0000-000000000000"));
    assertEquals("Opniscience", order.customerName());
    assertEquals(1, order.items().size());
    assertEquals("Example 1", order.items().getFirst().product());
    assertEquals(5, order.items().getFirst().quantity());
    assertEquals(34.567, order.items().getFirst().unitPrice());
  }
}
