/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author anhco
 */

public class Dictionary {
    int idx;
    String word;
    String detail;
    String newword;
    String newdetail;
    Scanner tu = new Scanner(System.in);
    public int idxmax=139243;
   
    public void tratu() throws SQLException {
        Connection conn = Jdbcconnection.getConnection();
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM tbl_edict WHERE word='" + word + "'";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
             idx = rs.getInt("idx");
             detail = rs.getString("detail");
             word = rs.getString("word");
           // System.out.println(detail);
        }
    }
    // tìm id cao nhất 

// thêm từ 
    public void addword() throws SQLException {
            Connection conn=Jdbcconnection.getConnection();
           PreparedStatement  PS = null;  
                String sql="INSERT INTO tbl_edict (idx,word,detail) VALUES (?,?,?)";
                 PS =conn.prepareStatement(sql);
                 PS.setInt(1, idx);
                 PS.setString(2, word);
                 PS.setString(3,detail);
                PS.executeUpdate();
                idxmax++;
                PS.close();
           }
           
    
// xóa từ 
     public void deleteword() throws SQLException {
            Connection conn=Jdbcconnection.getConnection();
            PreparedStatement  PS = null;
            String sql="DELETE FROM tbl_edict WHERE word=?";
            PS =conn.prepareStatement(sql);
            PS.setString(1,word);
            idxmax--;
            PS.executeUpdate();
    }
// sửa từ 
     public void Modifiword() throws SQLException {
            Connection conn=Jdbcconnection.getConnection();
            PreparedStatement  PS = null;
            String sql="UPDATE tbl_edict SET word= ? WHERE word=?";
            PS =conn.prepareStatement(sql);
            PS.setString(1, newword);
            PS.setString(2, word);
            PS.executeUpdate();
    }
    public void Modifiword_detail() throws SQLException {
            Connection conn=Jdbcconnection.getConnection();
            PreparedStatement  PS = null;
            String sql="UPDATE tbl_edict SET word= ?,detail=? WHERE word=?";
            PS =conn.prepareStatement(sql);
            PS.setString(1, newword);
            PS.setString(2, newdetail);
            PS.setString(3, word);
            PS.executeUpdate();
    }
    public void Modifidetail() throws SQLException {
            Connection conn=Jdbcconnection.getConnection();
            PreparedStatement  PS = null;
            String sql="UPDATE tbl_edict SET detail= ? WHERE word=?";
            PS =conn.prepareStatement(sql);
            PS.setString(1, newdetail);
            PS.setString(2, word);
            PS.executeUpdate();
    } 
     public void ShowAllWord () throws SQLException {
        Connection conn = Jdbcconnection.getConnection();
        Statement statement= conn.createStatement();
        String sql="SELECT * FROM tbl_edict Where idx<20";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next())
        {
             idx= rs.getInt("idx");
            word=rs.getString("word");
             detail=rs.getString("detail");
            System.out.println(idx+"        "+word+"        "+detail);
        }
    }
     public void truyvan() throws SQLException
     {
         Connection conn = Jdbcconnection.getConnection();
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM tbl_edict WHERE word like '" + word + "'";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
             idx = rs.getInt("idx");
             detail = rs.getString("detail");
             word = rs.getString("word");
             System.out.println();
           // System.out.println(detail);
        }
     }
    /* public static void main(String[] args) throws SQLException
     {
         Dictionary tudien= new Dictionary();
        tudien.searchid();
        
         /*tudien.addword();
         tudien.tratu();
         tudien.Modifiword();
         tudien.tratu();
         tudien.deleteword();
         tudien.tratu();
         tudien.ShowAllWord();
     }*/
}
