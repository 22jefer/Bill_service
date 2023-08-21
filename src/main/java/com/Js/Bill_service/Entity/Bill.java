/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Bill_service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Asus
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Bill")
public class Bill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String date;
    
    @Column(nullable = false)
    private String paymentMethod;
    
    @Column(nullable = false)
    private Double taxes;
    
    @Column(nullable = false)
    private Double total;
    
    @Column(nullable = false)
    private String paymentCondition;
    
    @Column(nullable = false)
    private int productId;
        
    
}
