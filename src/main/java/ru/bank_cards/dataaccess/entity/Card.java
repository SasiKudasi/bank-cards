package ru.bank_cards.dataaccess.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class Card {
    String cardNumber;
    String userName;
    LocalDate time;
    String status;
    BigDecimal amount;
    List<Payments> history;
    User user;
}
