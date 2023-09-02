/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Bill_service.Service;

import com.Js.Bill_service.Entity.Bill;
import com.Js.Bill_service.ProductPTO.Product;
import com.Js.Bill_service.ProductPTO.Response_product;
import com.Js.Bill_service.ProductPTO.Supplier;
import com.Js.Bill_service.Repository.Bill_repository;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Asus
 */

@Service
@AllArgsConstructor
@Data

public class Bill_service {
    
    private final Bill_repository bill_repository;
    
    private final RestTemplate restTemplate;

    
    public Bill saveBill (Bill bill){
        return bill_repository.save(bill);
    }
    
    public Bill getBillById (Integer id){
        return bill_repository.findById(id).get();
    }
    
    public List<Bill> AllBill (){
        return bill_repository.findAll();
    }
    
    public Bill updateBill (Bill bill){
        return bill_repository.save(bill);
    }
    
    public void deleteBillById (Integer id){
        bill_repository.deleteById(id);
    } 
    
    public Supplier response_supplier(Integer id){
        
        Bill bill = bill_repository.findById(id).get();
        
        ResponseEntity<Supplier> responseEntity = restTemplate.getForEntity(
                "http://localhost:8081/api/supplier/"+bill.getSupplierId(), 
                Supplier.class);
        
        Supplier supplier = responseEntity.getBody();
        
        return supplier;
        
    }
    
    public Product response_product (Integer id){

        Bill bill = bill_repository.findById(id).get();

        ResponseEntity<Product> responseEntity = restTemplate.getForEntity(
                "http://localhost:8082/api/product/"+bill.getProductId(),
                Product.class);

        Product product = responseEntity.getBody();
        
        return product;
        
    }
    
    public Response_product response (Integer id){
        
        Bill bill = bill_repository.findById(id).get();
        Response_product response_bill = new Response_product();
   
        response_bill.setProduct(response_product(id));
        response_bill.setSupplier(response_supplier(id));
        response_bill.setBill(bill);

        return response_bill;
    }
    
}
