package ru.bank_cards.dataaccess.entity;

import lombok.Data;
import ru.bank_cards.utilits.enums.Role;

import java.util.List;
@Data
public class User {
    Long id;
    String email;
    String pwd;
    Role role;
    List<Card> cards;

}
