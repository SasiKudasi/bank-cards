package ru.bank_cards.dataaccess.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;


@Data
public class Payments {
    Long id;
    Card from;
    Card to;
    LocalTime time;
    LocalDate date;
    String status;
    BigDecimal amount;
}
