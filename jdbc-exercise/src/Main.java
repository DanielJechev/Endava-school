import java.sql.*;
import java.util.Properties;

public class Main {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE_NAME = "vehicles";

    public static void main(String[] args) throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "Mnbvcxz12");
        Connection connection = DriverManager.getConnection(CONNECTION_STRING + DATABASE_NAME, properties);
        String insertCarsQuery = "insert into cars (id, kilometers,make,model,registered_on) values(?,?,?,?,?)";
        PreparedStatement stat = connection.prepareStatement(insertCarsQuery);

        for (int i = 0; i < 10; i++) {
            stat.setInt(1, 1 + i);
            stat.setInt(2, 1000 + i);
            stat.setString(3, "BMW" + i);
            stat.setString(4, "Audi" + i);
            stat.setString(5, "2020-1-" + (1 + i));
            stat.executeUpdate();
        }

        String insertPersonsQuery = "insert into persons (id, first_name,last_name,job,car_id) values(?,?,?,?,?)";
        PreparedStatement statPersons = connection.prepareStatement(insertPersonsQuery);

        for (int i = 0; i < 10; i++) {
            statPersons.setInt(1, 1 + i);
            statPersons.setString(2, "Ivan" + i);
            statPersons.setString(3, "Georgiev" + i);
            statPersons.setString(4, "Developer" + i);
            statPersons.setInt(5, 1 + i);
            statPersons.executeUpdate();
        }


        String query = "SELECT * from persons";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.printf("First name: :%s %n", resultSet.getString("first_name"));
            System.out.printf("Last name: %s %n", resultSet.getString("last_name"));
            System.out.printf("Car id:  %s %n", resultSet.getString("car_id"));
        }
    }
}



