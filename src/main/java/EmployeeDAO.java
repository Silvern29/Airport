import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class EmployeeDAO implements DAO<Employee>{

    public LinkedList<Employee> getAllElements() {
        LinkedList<Employee> employees = new LinkedList<Employee>();

        try {
            String dbQuery = "SELECT * FROM employees";
            Statement state = DBConnector.instance.getConnection().createStatement();
            ResultSet result = state.executeQuery(dbQuery);

            while(result.next()) {
                int compId = result.getInt("comp_id");
                String crewStatus = result.getString("crew_status");
                String firstName = result.getString("first_name");
                String lastName = result.getString("last_name");
                String street = result.getString("street");
                String apartment = result.getString("apartment");
                String zip = result.getString("zip");
                String city = result.getString("city");
                String phone = result.getString("phone");
                String email = result.getString("email");
                String pantSize = result.getString("pant_size");
                String shirtSize = result.getString("shirt_size");
                Date updatedAt = result.getDate("updated_at");
                Date createdAt = result.getDate("created_at");

                Employee emp = new Employee(compId, crewStatus, firstName, lastName, street, apartment, city, zip, phone, email, pantSize, shirtSize);
                employees.add(emp);
//                System.out.printf("%d, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s%n", compId, crewStatus, firstName, lastName, street, apartment, zip, phone, email, updatedAt, createdAt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public Employee getElement(String key) {
        try {
            String dbQuery = "SELECT * FROM employees";
            Statement state = DBConnector.instance.getConnection().createStatement();
            ResultSet result = state.executeQuery(dbQuery);

            while(result.next()) {
                int compId = result.getInt("comp_id");
                String crewStatus = result.getString("crew_status");
                String firstName = result.getString("first_name");
                String lastName = result.getString("last_name");
                String street = result.getString("street");
                String apartment = result.getString("apartment");
                String zip = result.getString("zip");
                String city = result.getString("city");
                String phone = result.getString("phone");
                String email = result.getString("email");
                String pantSize = result.getString("pant_size");
                String shirtSize = result.getString("shirt_size");
                Date updatedAt = result.getDate("updated_at");
                Date createdAt = result.getDate("created_at");

                Employee emp = new Employee(compId, crewStatus, firstName, lastName, street, apartment, city, zip, phone, email, pantSize, shirtSize);
                employees.add(emp);
//                System.out.printf("%d, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s%n", compId, crewStatus, firstName, lastName, street, apartment, zip, phone, email, updatedAt, createdAt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public void addElement(Employee el) {

    }

    public void updateElement(Employee el, String col, String set, String cond) {

    }

    public void deleteElement(String key) {

    }
}
