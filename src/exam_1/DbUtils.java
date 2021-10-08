package exam_1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {
    private static DbUtils utils = new DbUtils();
    private DbUtils() {

    }
    public static DbUtils getInstance() {
        return utils;
    }
    public Connection getCon() throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, "root", "koreait");
        return conn;
    }
    public void closeCon(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {

            }
        }
    }
}