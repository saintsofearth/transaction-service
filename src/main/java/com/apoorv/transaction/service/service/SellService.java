package com.apoorv.transaction.service.service;

import com.apoorv.transaction.service.entity.Sell;
import com.apoorv.transaction.service.repository.SellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellService {

    @Autowired
    private SellRepository sellRepository;

    public Sell addSell(Sell sell) {
        return sellRepository.save(sell);
    }

    public List<Sell> getUserAllSell(String userId) {
        return sellRepository.findAllByUserId(userId);
    }
}
