package com.apoorv.transaction.service.service;


import com.apoorv.transaction.service.entity.Purchase;
import com.apoorv.transaction.service.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public Purchase addPurchase(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    public List<Purchase> getUserAllPurchase(String userId) {
        return purchaseRepository.findAllByUserId(userId);
    }

}
