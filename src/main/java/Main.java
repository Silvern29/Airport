import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DBConnector dbc = new DBConnector("localhost", "ccp19", "root", "pass");

        Connection connection = dbc.connectDB();
        dbc.breakDBCon(connection);
    }
}
