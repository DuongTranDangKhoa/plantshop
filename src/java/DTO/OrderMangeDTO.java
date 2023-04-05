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
public class OrderMangeDTO {
    private int OrderID;
    private String OrdDate;
    private String shipDate;
    private int status;
    private String email;

    public OrderMangeDTO(int OrderID, String OrdDate, String shipDate, int status, String email) {
        this.OrderID = OrderID;
        this.OrdDate = OrdDate;
        this.shipDate = shipDate;
        this.status = status;
        this.email = email;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
