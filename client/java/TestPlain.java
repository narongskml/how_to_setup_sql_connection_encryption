package client.java;
import java.sql.*;

public class TestPlain {
  public static void main(String[] args) throws Exception {
    String url = "jdbc:sqlserver://TOMNB:1433;databaseName=stock_price;encrypt=false;";
            
    try (Connection c = DriverManager.getConnection(url, "stockuser", "!passstock")) {
      try (Statement s = c.createStatement();
           ResultSet rs = s.executeQuery("select top 3 Symbol,Timestamp, ZLast from dbo.stock_price;")) {
        while (rs.next()) System.out.println(rs.getString(1)+","+rs.getString(2)+ ","+rs.getString(3) );
      }
    }
  }
}
