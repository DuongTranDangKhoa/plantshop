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
public class AccountDTO {
    private int accID;
    private String email;
    private String password;
    private String fullnameString;
    private int status;
    private String phone;
    private int role;

    public AccountDTO() {
    }

    public AccountDTO(int accID, String email, String password, String fullnameString, int status, String phone, int role) {
        this.accID = accID;
        this.email = email;
        this.password = password;
        this.fullnameString = fullnameString;
        this.status = status;
        this.phone = phone;
        this.role = role;
    }


    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullnameString() {
        return fullnameString;
    }

    public void setFullnameString(String fullnameString) {
        this.fullnameString = fullnameString;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
}
