package com.opniscience.interview.orders.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "order_items")
public class OrderItem {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String product;
  private int quantity;
  private double unitPrice;

  @ManyToOne(fetch = FetchType.LAZY)
  private Order order;

  public OrderItem() {
  }

  public OrderItem(UUID id, String product, int quantity, double unitPrice) {
    this.id = id;
    this.product = product;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public UUID getId() {
    return this.id;
  }

  public String getProduct() {
    return this.product;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public double getUnitPrice() {
    return this.unitPrice;
  }

  public Order getOrder() {
    return this.order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }
}
