package ru.bank_cards.dataaccess.entity;

import lombok.Data;
import java.util.List;
@Data
public class User {
    Long id;
    String email;
    String pwd;
    List<Card> cards;

}
