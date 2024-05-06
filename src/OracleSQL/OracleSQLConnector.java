package OracleSQL;

import java.sql.*;

public class OracleSQLConnector {
    String url = "jdbc:oracle:thin:@hostname:port:sid";
    String username = "your_username";
    String password = "your_password";
    String sql = "INSERT INTO your_table (column1, column2) VALUES (?, ?)";
    public OracleSQLConnector(){}
    public OracleSQLConnector(String username,String password,String url,String sql){
        this.username=username;this.password=password;this.url=url;this.sql=sql;
    }
    public void insertData(String value1, String value2) {

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, value1);
            pstmt.setString(2, value2);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " rows inserted.");
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
