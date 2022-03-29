package com.example.myproject.controller;

import com.example.myproject.entity.Recharge;
import com.example.myproject.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RechargeController {

    @Autowired
    private RechargeService service;

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/getRecharge")
    public ResponseEntity<List<Recharge>> getRecharge(){
        List<Recharge> rechargeModels=service.findAllRechargeModel();
        return new ResponseEntity<>(rechargeModels, HttpStatus.OK);
    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/recharge/{name}")
    public ResponseEntity<List<Recharge>> getRechargeModelByName(@PathVariable("name") String name){
        Recharge rechargeModels=service.findRechargeModelByName(name);
        return new ResponseEntity(rechargeModels, HttpStatus.OK);
    }
    @CrossOrigin("http://localhost:4200")
    @PostMapping("/addRecharge")
    public ResponseEntity<Recharge> addRecharge(@RequestBody Recharge data){
        Recharge newRechargeModel=service.addRecharge(data);
        return new ResponseEntity(newRechargeModel, HttpStatus.CREATED);
    }

    @CrossOrigin("http://localhost:4200")
    @PutMapping("/update")
    public Recharge update(@RequestBody Recharge add)
    {
        return service.updatePlan(add);
    }

    @CrossOrigin("http://localhost:4200")
    @DeleteMapping("/delete/{rechargeId}")
    public void delete(@PathVariable("rechargeId") int rechargeId)
    {
        service.delete(rechargeId);
    }



}
