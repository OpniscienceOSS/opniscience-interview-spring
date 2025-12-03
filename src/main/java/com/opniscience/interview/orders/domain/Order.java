package com.opniscience.interview.orders.domain;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(name = "customer_name")
  private String customerName;

  @Column(name = "created_at")
  private Instant createdAt;

  @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
  private final List<OrderItem> items = new ArrayList<>();

  public Order() {
  }

  public Order(UUID id, String customerName, Instant createdAt) {
    this.id = id;
    this.customerName = customerName;
    this.createdAt = createdAt;
  }

  public UUID getId() {
    return this.id;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public Instant getCreatedAt() {
    return this.createdAt;
  }

  public List<OrderItem> getItems() {
    return this.items;
  }

  public void addItem(OrderItem item) {
    // TODO: implement
  }
}
