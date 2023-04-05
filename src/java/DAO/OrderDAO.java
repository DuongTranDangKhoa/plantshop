/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.OrderDTO;
import DTO.OrderDetail;
import DTO.OrderMangeDTO;
import DTO.PlantDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import utils.DBUtils;

/**
 *
 * @author Khoa Duong
 */
public class OrderDAO implements Serializable {

    public static ArrayList<OrderDTO> getOrder(String email) throws ClassNotFoundException, SQLException {
        Connection con = DBUtils.makeConnection();
        ResultSet rs = null;
        PreparedStatement stm = null;
        ArrayList<OrderDTO> list = new ArrayList<>();
        try {
            String sql = " select o.* \n"
                    + "from Orders o join Accounts on (o.AccID = Accounts.accID)\n"
                    + "where Accounts.email = ?  ";
            stm = con.prepareStatement(sql);
            stm.setString(1, email);
            rs = stm.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            while (rs.next()) {
                OrderDTO order = new OrderDTO(rs.getInt("OrderID"), rs.getDate("OrdDate"), rs.getDate("shipdate"), rs.getInt("status"), rs.getInt("AccID"));
                list.add(order);
            }
            return list;

        }
    }

    public ArrayList<OrderMangeDTO> getAllOrder() throws ClassNotFoundException, SQLException {
        Connection con = DBUtils.makeConnection();
        ResultSet rs = null;
        PreparedStatement stm = null;
        ArrayList<OrderMangeDTO> list = new ArrayList<>();
        try {
            String sql = " select o.[OrderID] ,o.[OrdDate], o.[shipdate], o.[status], a.[email]"
                    + " from Orders o join Accounts a on(o.AccID = a.accID) ";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            while (rs.next()) {
                OrderMangeDTO OM = new OrderMangeDTO(rs.getInt("OrderID"), rs.getString("OrdDate"), rs.getString("shipdate"), rs.getInt("status"), rs.getString("email"));
                list.add(OM);
            }
            return list;

        }
    }

    public static boolean insertOrder(String email, HashMap<PlantDTO, Integer> cart) {
        Connection cn = null;
        boolean result = false;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                int accid = 0, orderid = 0;
                cn.setAutoCommit(false);
                String sql = "select accID from Accounts where Accounts.email=?";
                PreparedStatement stm = cn.prepareStatement(sql);
                stm.setString(1, email);
                ResultSet rs = stm.executeQuery();
                if (rs != null && rs.next()) {
                    accid = rs.getInt("accID");
                }
                System.out.println("accoutid:" + accid);
                Date d = new Date(System.currentTimeMillis());
                System.out.println("order date:" + d);
                sql = "insert into Orders(OrdDate,status, AccID) values(?,?,?)";
                stm = cn.prepareStatement(sql);
                stm.setDate(1, d);
                stm.setInt(2, 1);
                stm.setInt(3, accid);
                stm.executeUpdate();
                sql = "select top 1 orderID from Orders order by orderID desc";
                stm = cn.prepareStatement(sql);
                rs = stm.executeQuery();
                if (rs != null && rs.next()) {
                    orderid = rs.getInt("orderID");
                }
                System.out.println("orderid:" + orderid);
                Set<PlantDTO> pids = cart.keySet();
                for (PlantDTO pid : pids) {
                    sql = "insert into OrdereDetails values(?,?,?)";
                    stm = cn.prepareStatement(sql);
                    stm.setInt(1, orderid);
                    stm.setInt(2, pid.getId());
                    stm.setInt(3, cart.get(pid));
                    stm.executeUpdate();
                    cn.commit();
                    cn.setAutoCommit(true);
                }
                return true;
            } else {
                System.out.println("k chen order dc");
            }
        } catch (Exception e) {
            try {
                if (cn != null) {
                    cn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
            result = false;
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
