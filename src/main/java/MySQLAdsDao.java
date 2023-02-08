import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {

         connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }


    @Override
    public List<Ad> all() throws SQLException {
        String query = "SELECT * FROM ads";
        try{

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            List<Ad> returnedList = new ArrayList<>();
            while (rs.next()) {
                returnedList.add(
                        new Ad(
                                rs.getLong("id"),
                                rs.getLong("userId"),
                                rs.getString("title"),
                                rs.getString("description")
                        ));
            }
            return returnedList;
        }
        catch (SQLException e){
            throw new RuntimeException("Error connecting to database.", e);
        }
    }
    @Override
    public Long insert(Ad ad) throws SQLException {
        String query = "INSERT INTO ads (title, users_id, description) VALUES ('title', 2, 'description')";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            System.out.println("Inserted a new record! New id: " + rs.getLong(1));
        }
        return null;
    }
}
