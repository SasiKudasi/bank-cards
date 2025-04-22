package ru.bank_cards.dataaccess.entity;

import lombok.Data;
import ru.bank_cards.utilits.enums.PaymentStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class Payments {
    Long id;
    Card from;
    Card to;
    LocalDateTime timestamp;
    PaymentStatus status;
    BigDecimal amount;
}
