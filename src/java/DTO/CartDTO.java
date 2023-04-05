/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Khoa Duong
 */
public class CartDTO {
    private int accID;
    private int plantID;
    private String name;
    private int price;
    private int quantity;

    public CartDTO() {
    }

    public CartDTO(int accID, int plantID, String name, int price, int quantity) {
        this.accID = accID;
        this.plantID = plantID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public int getPlantID() {
        return plantID;
    }

    public void setPlantID(int plantID) {
        this.plantID = plantID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
