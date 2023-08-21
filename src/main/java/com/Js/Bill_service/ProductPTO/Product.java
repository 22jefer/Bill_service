/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Bill_service.ProductPTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Asus
 */

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Product {

    private int id;
 
    private String productCode;

    private String brand;

    private double price;

    private String size;

    private int existence;
    
    private String description;

    private int supplierId;
    
    
    
}
