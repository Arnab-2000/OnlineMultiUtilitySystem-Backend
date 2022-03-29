package com.example.myproject.repository;

import com.example.myproject.entity.Recharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RechargeRepository extends JpaRepository<Recharge,Integer> {
    Optional<Recharge> findRechargeModelByName(String name);
}
