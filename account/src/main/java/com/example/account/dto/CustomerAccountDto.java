package com.example.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAccountDto {
    private UUID id;
    private BigDecimal amount = BigDecimal.valueOf(0);
    private LocalDate creationDate;

    private AccountCustomerDto customer;

    private Set<TransactionDto> transactions;
}
