/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;


/**
 *
 * @author Mahima
 */
public class connect {
            //JDBC driver and db URL
            static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
            static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
            //Database Credentials
            static final String USER = "system";
            static final String PASS = "system";
            public static void main(String[] args) throws Exception {
                Connection conn = null;
                Statement stmt = null;
                try{
                //STEP 2: Register JDBC driver
                    Class.forName("oracle.jdbc.driver.OracleDriver");

                    //STEP 3: Open a connection
                    System.out.println("Connecting to a selected database...");
                    conn = DriverManager.getConnection(URL, USER, PASS);
                    System.out.println("Connected database successfully...");
      
                    //STEP 4: Execute a query
                    stmt = conn.createStatement();
      
                    String sql = "create table songs(name varchar(20),artist varchar(20), album varchar(20), path varchar(20))";
                    stmt.executeUpdate(sql);
                    //sql = "insert into songs values('+songName.getText()+''+artistName.getText()+''+albumName.getText()+''+filePath.getText()'";
                           
                    //bstmt.executeUpdate(sql);
                    
            
                }catch(SQLException se){System.out.println(se);}
            }
            }

            
            
            
            
    
