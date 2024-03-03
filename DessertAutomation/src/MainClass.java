import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;


 class MainClass {

     
     public static void main(String[] args) {
      connect();
SelectAll();
     }
        
          public static Connection connect() {
             Connection conn =null;

            try{
                
                Class.forName("org.sqlite.JDBC");
                  conn=DriverManager.getConnection("jdbc:sqlite:database.db");
                  System.out.println("connection to DB has been established");
                  return conn;
            }catch(Exception e){
                System.out.println("connection faild"+e);
                return null;
            }
     
     }

   
     public static  void SelectAll(){
         
        
         
         MainClass m;
         List<MainClass> personList=new ArrayList<>();
         String sql= "  SELECT * FROM Customer";
         
         try {
                  Connection conn= connect();
                 Statement stmt =conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql);
                  //loot through the result set 
                  while (rs.next()){
                      
                      System.out.println(rs.getString("id") +"\n"+rs.getString("Name"));  
                  }
         }catch (SQLException e){
             System.out.println("failld"+e.getMessage());
         }
                  
     }
 }     