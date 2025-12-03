package com.opniscience.interview.orders.api;

import com.opniscience.interview.orders.api.dto.OrderDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {
  @GetMapping
  public List<OrderDto> list() {
    return null;
  }

  @GetMapping("/{id}")
  public OrderDto get(@PathVariable UUID id) {
    return null;
  }

  @PostMapping
  public OrderDto create(@RequestBody OrderDto dto) {
    return null;
  }
}
