import com.javatunes.util.ItemDAO;
import com.javatunes.util.MusicItem;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ItemDAOMain
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        MusicItem item = new MusicItem();
        Connection conn = null;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/JavaTunesDB");

        ItemDAO itemDAO = new ItemDAO(conn);
        var num1 = itemDAO.searchById(1L);
        var num2 = itemDAO.searchById(100L);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println();

        var num3 = itemDAO.searchByKeyword("of");
        var num4 = itemDAO.searchByKeyword("Gay");
        System.out.println(num3);
        System.out.println(num4);
        System.out.println();

        itemDAO.create(num1, "Gay", "saf", BigDecimal.valueOf(15.5), BigDecimal.valueOf(156.564));
        var num5 = itemDAO.searchByKeyword("of");
        var num6 = itemDAO.searchByKeyword("Gay");
        System.out.println(num5);
        System.out.println(num6);
        System.out.println();
    }
}
