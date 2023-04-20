import java.sql.*;

public class Program {
    private Connection connection;

    public Program(String databasePath) throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:sqlite:" + databasePath);
    }

    public void close() throws SQLException {
        this.connection.close();
    }

    public void insertData(String name, int age) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("INSERT INTO korisnik (id, name, age) VALUES (?, ?, ?)");
        statement.setString(1, name);
        statement.setInt(2, age);
        statement.executeUpdate();
    }

    public void updateData(int id, String name, int age) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("UPDATE korisnik SET name=?, age=? WHERE id=?");
        statement.setString(1, name);
        statement.setInt(2, age);
        statement.setInt(3, id);
        statement.executeUpdate();
    }

    public void deleteData(int id) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("DELETE FROM korisnik WHERE id=?");
        statement.setInt(1, id);
        statement.executeUpdate();
    }

    public void selectData() throws SQLException {
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM korisnik");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") + " " + resultSet.getInt("age"));
        }
    }
}