package com.apoorv.transaction.service.repository;

import com.apoorv.transaction.service.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

    List<Purchase> findAllByUserId(String userId);

}
