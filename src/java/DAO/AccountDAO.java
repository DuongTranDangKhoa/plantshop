/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import utils.DBUtils;
import DTO.AccountDTO;
import static com.sun.activation.registries.LogSupport.log;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.tomcat.util.net.jsse.openssl.Authentication;
import sun.security.pkcs11.Secmod;

/**
 *
 * @author Khoa Duong
 */
public class AccountDAO implements Serializable {

    public AccountDTO getAccount(String email, String password) throws ClassNotFoundException, SQLException {
        Connection com = null;
        AccountDTO acc = null;
        try {
            com = DBUtils.makeConnection();
            if (com != null) {
                String sql = " select accID, email, password, fullname, status, phone , role "
                        + "   from Accounts "
                        + "   where status = 1 and email = ? and password = ? COLLATE LAtin1_General_CS_AS ";
                PreparedStatement stm = com.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, password);
                ResultSet rs = stm.executeQuery();
                if (rs != null && rs.next()) {
                    int AccID = rs.getInt("accID");
                    String Email = rs.getString("email");
                    String Password = rs.getString("password");
                    String phone = rs.getString("phone");
                    String Fullname = rs.getString("fullname");
                    int Status = rs.getInt("status");
                    int Role = rs.getInt("role");
                    acc = new AccountDTO(AccID, Email, Password, Fullname, Status, phone, Role);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (com != null) {
                try {
                    com.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return acc;
    }
    public static boolean FAccount(String email) throws ClassNotFoundException, SQLException {
        Connection com = null;
        AccountDTO acc = null;
        try {
            com = DBUtils.makeConnection();
            if (com != null) {
                String sql = " select accID, email, password, fullname, status, phone , role "
                        + "   from Accounts "
                        + "   where email = ? ";
                PreparedStatement stm = com.prepareStatement(sql);
                stm.setString(1, email);
                ResultSet rs = stm.executeQuery();
                if (rs.next()) {
                    return true;
                }else{
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public static boolean insertAccount(String newEmail, String newPassword, String newFullname, String newPhone, int newSatus, int newRole) throws ClassNotFoundException, SQLException {
        Connection con = DBUtils.makeConnection();
        int rs = 0;
        PreparedStatement stm = null;
        String sql = " insert Accounts(email, password, fullname,phone,status, role) "
                + " values ( ? , ? , ? , ? , ? , ?) ";
        stm = con.prepareStatement(sql);
        stm.setString(1, newEmail);
        stm.setString(2, newPassword);
        stm.setString(3, newFullname);
        stm.setString(4, newPhone);
        stm.setInt(5, newSatus);
        stm.setInt(6, newRole);
        rs = stm.executeUpdate();
        if (rs > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<AccountDTO> getAllAccount() throws ClassNotFoundException, SQLException {
        Connection con = DBUtils.makeConnection();
        ArrayList<AccountDTO> list = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement stm = null;
        try {
            String sql = " select accID, email, password, fullname, status, phone , role "
                    + "   from Accounts ";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs != null && rs.next()) {
                int AccID = rs.getInt("accID");
                String Email = rs.getString("email");
                String Password = rs.getString("password");
                String phone = rs.getString("phone");
                String Fullname = rs.getString("fullname");
                int Status = rs.getInt("status");
                int Role = rs.getInt("role");
                AccountDTO acc = new AccountDTO(AccID, Email, Password, Fullname, Status, phone, Role);
                list.add(acc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
//    public boolean updateAccountDAO() throws ClassNotFoundException, SQLException{
//        Connection con = DBUtils.makeConnection();
//        ResultSet rs = null;
//        PreparedStatement stm = null;
//        String sql = "Update";
//    }
      public AccountDTO getAccountC(String email) throws ClassNotFoundException, SQLException {
        Connection com = null;
        AccountDTO acc = null;
        try {
            com = DBUtils.makeConnection();
            if (com != null) {
                String sql = " select accID, email, password, fullname, status, phone , role "
                        + "   from Accounts "
                        + "   where status = 1 and email = ? COLLATE LAtin1_General_CS_AS ";
                PreparedStatement stm = com.prepareStatement(sql);
                stm.setString(1, email);
              
                ResultSet rs = stm.executeQuery();
                if (rs != null && rs.next()) {
                    int AccID = rs.getInt("accID");
                    String Email = rs.getString("email");
                    String Password = rs.getString("password");
                    String phone = rs.getString("phone");
                    String Fullname = rs.getString("fullname");
                    int Status = rs.getInt("status");
                    int Role = rs.getInt("role");
                    acc = new AccountDTO(AccID, Email, Password, Fullname, Status, phone, Role);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (com != null) {
                try {
                    com.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return acc;
    }
    public boolean deleteAccount(String keyword ) throws SQLException{
        Connection con = null;
         ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            String sql = " delete from Accounts where [accID] = ? ";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, keyword);
            rs = stm.executeQuery();
        } catch (Exception e) {
            log("Error at MainController " + e.toString());
        }finally{
            if (rs.next()) {
                return true;
            }else{
                 return false;
            }
           
        }
        
    }
}
