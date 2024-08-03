package com.swsa.model;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Card {

    int CardId;
    int CardNo;
    long AccountNo;
    String CustomerName;
    int CVV;
    String CardType;

    }



