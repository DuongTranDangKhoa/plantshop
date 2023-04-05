package DTO;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khoa Duong
 */
public class CategoryDTO implements Serializable{
    private int CartID;
    private String CateName;

    public CategoryDTO(int CartID, String CateName) {
        this.CartID = CartID;
        this.CateName = CateName;
    }

    public int getCartID() {
        return CartID;
    }

    public void setCartID(int CartID) {
        this.CartID = CartID;
    }

    public String getCateName() {
        return CateName;
    }

    public void setCateName(String CateName) {
        this.CateName = CateName;
    }
    
}
