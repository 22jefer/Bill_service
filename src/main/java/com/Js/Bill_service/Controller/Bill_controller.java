/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Bill_service.Controller;

import com.Js.Bill_service.Entity.Bill;
import com.Js.Bill_service.ProductPTO.Response_product;
import com.Js.Bill_service.Service.Bill_service;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */

@RestController
@RequestMapping("/api/bill")
@AllArgsConstructor
@Data
public class Bill_controller {
    
    private final Bill_service bill_service;
    
    @PostMapping
    public Bill saveBill (@RequestBody Bill bill){
        return bill_service.saveBill(bill);
    }
    
    @GetMapping("/response/{id}")
    public Response_product response (@PathVariable Integer id){
        return bill_service.response(id);
    }
    
    @GetMapping("/{id}")
    public Bill getResponse_billById (@PathVariable Integer id){
        return bill_service.getBillById(id);
    }

    @GetMapping
    public List<Bill> AllBill (){
        return bill_service.AllBill();
    }
    
    @PutMapping
    public Bill updateBill (@RequestBody Bill bill){
        return bill_service.updateBill(bill);
    }
    
    @DeleteMapping("/{id}")
    public void deleteBillById (@PathVariable Integer id){
        bill_service.deleteBillById(id);
    }
    
}
