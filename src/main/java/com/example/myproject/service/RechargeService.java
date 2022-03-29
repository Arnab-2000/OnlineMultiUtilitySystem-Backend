package com.example.myproject.service;


import com.example.myproject.Exception.RechargeException;
import com.example.myproject.entity.Recharge;
import com.example.myproject.repository.RechargeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RechargeService {

    @Autowired
    private RechargeRepository repo;

    public  Recharge addRecharge(Recharge data)
    {
        return repo.save(data);

    }

    public List<Recharge> findAllRechargeModel() {
        return repo.findAll();
    }

    public Recharge findRechargeModelByName(String name) {
        return repo.findRechargeModelByName(name).
                orElseThrow(() -> new RechargeException("user not found"));
    }

    public Recharge updatePlan(Recharge m) {
        int rechargeId = m.getRechargeId();
        Recharge add = repo.findById(rechargeId).get();
        add.setRechargePlan(m.getRechargePlan());
        add.setRechargeType(m.getRechargeType());
        add.setRechargePrice(m.getRechargePrice());
        return repo.save(add);
    }

    public void delete(int rechargeId) {
        repo.deleteById(rechargeId);
    }
}