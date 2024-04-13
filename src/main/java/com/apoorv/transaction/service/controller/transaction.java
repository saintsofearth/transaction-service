package com.apoorv.transaction.service.controller;

import com.apoorv.transaction.service.entity.Purchase;
import com.apoorv.transaction.service.entity.Sell;
import com.apoorv.transaction.service.service.PurchaseService;
import com.apoorv.transaction.service.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("stock")
@RestController
public class transaction {

    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private SellService sellService;

    @GetMapping("test")
    public ResponseEntity testService() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("buy")
    public Purchase addPurchase(@RequestBody Purchase purchase) {
        float amountPaid = purchase.getUnits() * purchase.getUnitPrice();
        purchase.setAmountPaid(amountPaid);
        return purchaseService.addPurchase(purchase);
    }

    @GetMapping("user/{userId}/purchase")
    public List<Purchase> getUserAllPurchase(@PathVariable("userId") String userId) {
        return purchaseService.getUserAllPurchase(userId);
    }

    @PostMapping("sell")
    public Sell sellStock(@RequestBody Sell sell) {
        float amountReceived = sell.getUnitsSold() * sell.getUnitPrice();
        sell.setUnitPrice(amountReceived);
        return sellService.addSell(sell);
    }

    @GetMapping("user/{userId}/sell")
    public List<Sell> getUserAllSell(@PathVariable("userId") String userId) {
        return sellService.getUserAllSell(userId);
    }
}
