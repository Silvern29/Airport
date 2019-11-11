import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    public static DBConnector instance = new DBConnector();

    private String hostName;
    private String dbName;
    private String userName;
    private String passWord;
    private Connection connection;

    public DBConnector () {

    }

    public void setCred(String hostName, String dbName, String userName, String passWord) {
        this.hostName = hostName;
        this.dbName = dbName;
        this.userName = userName;
        this.passWord = passWord;
    }

    public Connection connectDB() throws SQLException {
        try {
            System.out.println("Connecting!");
            String dbURL = "jdbc:mysql://" + hostName + "/" + dbName;
            connection = DriverManager.getConnection(dbURL, userName, passWord);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return connection;
    }

    public Connection getConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            return connection;
        }
        return connectDB();
    }

    public void breakDBCon(){
        try {
            System.out.println("Breaking connection!");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
