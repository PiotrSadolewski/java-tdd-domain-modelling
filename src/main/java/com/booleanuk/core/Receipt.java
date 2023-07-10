package com.booleanuk.core;

import java.math.BigDecimal;
import java.util.Map;

public record Receipt(
    Map<Product, Integer> products,
    BigDecimal totalPrice
) {
}