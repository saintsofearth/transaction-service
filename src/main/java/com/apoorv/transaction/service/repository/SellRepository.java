package com.apoorv.transaction.service.repository;

import com.apoorv.transaction.service.entity.Sell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellRepository extends JpaRepository<Sell, Integer> {

    List<Sell> findAllByUserId(String userId);

}
