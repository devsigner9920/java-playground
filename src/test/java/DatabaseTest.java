import org.junit.jupiter.api.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTest {
    private final String URL = "jdbc:mysql://localhost:3306/test";
    private final String USER = "root";
    private final String PASSWORD = "password_test";
    @Test
    void 디비_연결_테스트() throws SQLException, ClassNotFoundException, InterruptedException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        for (int i = 0; i < 500; i++) {
            DriverManager.getConnection(URL, USER, PASSWORD);
        }

        Thread.sleep(50000);
    }
}
