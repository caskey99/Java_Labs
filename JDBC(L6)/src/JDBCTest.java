import java.sql.Connection;
import java.sql.DriverManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.sql.*;
import java.util.Properties;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Connection conn = null;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/JavaTunesDB");
        DatabaseMetaData dbmd = conn.getMetaData();
        System.out.println(dbmd.getDriverName());
        System.out.println(dbmd.getUserName());
        conn.close();

        Properties dbProps = new Properties();
        dbProps.load(new FileInputStream("jdbc_build.properties"));
        String driver = dbProps.getProperty("db.driver");
        String url = dbProps.getProperty("db.url");
        Class.forName(driver);

        String user = dbProps.getProperty("db.user");
        if (user != null)
        {
            String passwd = dbProps.getProperty("db.passwd");
            conn = DriverManager.getConnection(url,user,passwd);
        }
        else{
            conn = DriverManager.getConnection(url);
        }
        dbmd = conn.getMetaData();
        System.out.println(dbmd.getUserName());
    }
}
