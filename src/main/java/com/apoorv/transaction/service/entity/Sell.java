package com.apoorv.transaction.service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sell")
public class Sell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sellId;
    private String userId;
    private int stockId;
    private Date dateOfSell;
    private float amountReceived;
    private int unitsSold;
    private float unitPrice;
}
