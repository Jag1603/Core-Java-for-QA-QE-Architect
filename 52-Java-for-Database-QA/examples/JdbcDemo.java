import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        String sql = "SELECT id, status FROM orders WHERE id = ?";
        System.out.println("Prepared JDBC query: " + sql);
        System.out.println("Use Connection -> PreparedStatement -> ResultSet");
    }
}