package com.opniscience.interview.orders.api.dto;

import java.math.BigDecimal;

public record OrderSummaryDto(BigDecimal totalPrice, int totalItems) {
}
