package ru.bank_cards.dataaccess.entity;

import lombok.Data;
import ru.bank_cards.utilits.enums.CardStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class Card {

    String cardNumber;
    String userName;
    LocalDate time;
    CardStatus status;
    BigDecimal amount;
    List<Payments> outgoingPayments;
    List<Payments> incomingPayments;
    User user;
}
