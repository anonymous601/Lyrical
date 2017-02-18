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
    
    
            static Connection conn = null;
            
            
            //JDBC driver and db URL
        
            static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
            static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
            //Database Credentials
            static final String USER = "system";
            static final String PASS = "system";
            public static void main(String[] args) throws Exception {
                
                try{
                //STEP 2: Register JDBC driver
                    Class.forName("oracle.jdbc.driver.OracleDriver");

                    //STEP 3: Open a connection
                    System.out.println("Connecting to a selected database...");
                    conn = DriverManager.getConnection(URL, USER, PASS);
                    System.out.println("Connected database successfully...");
      
               
            
                }catch(SQLException se){System.out.println(se);}
            }
            
            public class insert{
                
            public Connection getconn()
            {
                return conn;
            }
                Statement stmt = null;
   
    public void main(String args[]) throws Exception{
        //connect con = new connect();
        stmt = getconn().createStatement();
        String sql= "insert into songs values('+songName.getText()+''+artistName.getText()+''+albumName.getText()+''+filePath.getText()'";
        stmt.executeUpdate(sql);
        getconn().close();
    }
    
    }
}
