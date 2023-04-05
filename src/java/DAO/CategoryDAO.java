/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.CategoryDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.DBUtils;

/**
 *
 * @author Khoa Duong
 */
public class CategoryDAO {
    public static ArrayList<CategoryDTO> getCategory() throws ClassNotFoundException, SQLException{
        Connection con = DBUtils.makeConnection();
        ResultSet rs = null;
        PreparedStatement stm = null;
        ArrayList<CategoryDTO> list = new ArrayList<>();
        String sql = " select * "
                + " from Categories ";
        stm = con.prepareStatement(sql);
        rs = stm.executeQuery();
        while (rs.next()) {            
            CategoryDTO dto = new CategoryDTO(rs.getInt("CateID"), rs.getString("CateName"));
            list.add(dto);
        }
        return list;
    }
}
