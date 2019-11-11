import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws SQLException {
        DBConnector.instance.setCred("localhost", "ccp19", "root", "pass");
        DBConnector.instance.connectDB();
        EmployeeDAO empDAO = new EmployeeDAO();

        LinkedList<Employee> emp = empDAO.getAllElements();

        for (Employee el: emp) {
            System.out.println(el);
        }

        DBConnector.instance.breakDBCon();

    }
}
