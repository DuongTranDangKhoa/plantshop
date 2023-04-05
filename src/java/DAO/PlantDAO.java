/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import utils.DBUtils;
import DTO.PlantDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Khoa Duong
 */
public class PlantDAO implements Serializable{

    public static ArrayList<PlantDTO> getPlants(String keyword, String searchby) {
        ArrayList<PlantDTO> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null && searchby != null) {
                String sql = " select PID, PName, price, imgPath, description, status, Plants.CateID as 'CateID', CateName "
                        + " from Plants join Categories on Plants.CateID= Categories.CateID ";
                if (searchby.equalsIgnoreCase("byname")) {
                    sql = sql + " where Plants.PName like ? ";
                } else {
                    sql = sql + " where CateName like ? ";
                }
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, "%"+keyword+"%");
                ResultSet rs = pst.executeQuery();
                if (rs!=null) {
                    while (rs.next()) {                        
                     int id = rs.getInt("PID");
                     String name = rs.getString("PName");
                     int price = rs.getInt("price");
                     String imgpath=rs.getString("imgPath");
                     String descriptionString= rs.getString("description");
                     int status = rs.getInt("status");
                     int cateid = rs.getInt("CateID");
                     String catename = rs.getString("CateName");
                     PlantDTO plant = new PlantDTO(id, name, price, imgpath, descriptionString, status, cateid, catename);
                    list.add(plant);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return list;
    }
    public PlantDTO getPlantById(int id){
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = " select PID, PName, price, imgPath, description, status, Plants.CateID as 'CateID', CateName "
                        + " from Plants join Categories on Plants.CateID= Categories.CateID "
                        + " where PID = ? ";
             
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery();
                if (rs!=null) {
                    if (rs.next()) {                        
                     String name = rs.getString("PName");
                     int price = rs.getInt("price");
                     String imgpath=rs.getString("imgPath");
                     String descriptionString= rs.getString("description");
                     int status = rs.getInt("status");
                     int cateid = rs.getInt("CateID");
                     String catename = rs.getString("CateName");
                     PlantDTO plant = new PlantDTO(id, name, price, imgpath, descriptionString, status, cateid, catename);
                    return plant;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return null;
    }
    public static ArrayList<PlantDTO> getPlantsN() {
        ArrayList<PlantDTO> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = " select PID, PName, price, imgPath, description, status, Plants.CateID as 'CateID', CateName "
                        + " from Plants join Categories on Plants.CateID= Categories.CateID ";           
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs!=null) {
                    while (rs.next()) {                        
                     int id = rs.getInt("PID");
                     String name = rs.getString("PName");
                     int price = rs.getInt("price");
                     String imgpath=rs.getString("imgPath");
                     String descriptionString= rs.getString("description");
                     int status = rs.getInt("status");
                     int cateid = rs.getInt("CateID");
                     String catename = rs.getString("CateName");
                     PlantDTO plant = new PlantDTO(id, name, price, imgpath, descriptionString, status, cateid, catename);
                    list.add(plant);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return list;
    }
    
}
