/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utils.DBUtils;

/**
 *
 * @author Khoa Duong
 */
public class CartDAO{

    public boolean addtoCart(int accID, int plantID, String name, int price, int quantity) throws ClassNotFoundException, SQLException {
        Connection con = DBUtils.makeConnection();
        int rs = 0;
        PreparedStatement stm = null;
        String sql = "  insert into cart \n"
                + " values ( ? , ? , ? , ? , ?) ";
        stm = con.prepareStatement(sql);
        stm.setInt(1, accID);
        stm.setInt(2, plantID);
        stm.setString(3, name);
        stm.setInt(4, price);
        stm.setInt(5, quantity);
        rs = stm.executeUpdate();
        if (rs > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void updatetoCart(int plantID, int quantity) throws ClassNotFoundException, SQLException {
        Connection con = DBUtils.makeConnection();
        int rs = 0;
        PreparedStatement stm = null;
        String sql = " UPDATE cart "
                + " SET quantity = ? "
                + " WHERE plantID = ? ";
        stm = con.prepareStatement(sql);
        stm.setInt(1, quantity);
        stm.setInt(2, plantID);
        rs = stm.executeUpdate();
    }
}
