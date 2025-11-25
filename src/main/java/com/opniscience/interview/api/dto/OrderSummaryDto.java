package com.opniscience.interview.api.dto;

import java.math.BigDecimal;

public record OrderSummaryDto(BigDecimal totalPrice, int totalItems) {
}
