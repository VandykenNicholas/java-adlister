import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {

        DriverManager.registerDriver(new Driver());
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
            DriverManager.registerDriver(new Driver());
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            List<Ad> returnedList = new ArrayList<>();
            while (rs.next()) {
                returnedList.add(
                        new Ad(
                                rs.getLong("id"),
                                rs.getLong("users_id"),
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
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }


    private String createInsertQuery(Ad ad) {
        return "INSERT INTO ads(users_id, title, description) VALUES "
                + "(" + ad.getUserId() + ", "
                + "'" + ad.getTitle() +"', "
                + "'" + ad.getDescription() + "')";
    }

}
