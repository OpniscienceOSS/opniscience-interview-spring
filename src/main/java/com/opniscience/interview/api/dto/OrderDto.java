package com.opniscience.interview.api.dto;

import java.util.List;
import java.util.UUID;

public record OrderDto(UUID id, String customerName, List<OrderItemDto> items) {
}
